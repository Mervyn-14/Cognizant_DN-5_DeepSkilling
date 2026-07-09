package com.cognizant;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import javax.crypto.SecretKey;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(JwtAuthorizationFilter.class);

    private static final SecretKey KEY =
            Keys.hmacShaKeyFor(
                    "abcdefghijklmnopqrstuvwxyz123456"
                            .getBytes(StandardCharsets.UTF_8));

    public JwtAuthorizationFilter() {

        super(authentication -> authentication);

        LOGGER.info("JwtAuthorizationFilter Created");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain)
            throws IOException, ServletException {

        LOGGER.info("START");

        String header = request.getHeader("Authorization");

        LOGGER.debug("Authorization Header : {}", header);

        if (header == null || !header.startsWith("Bearer ")) {

            chain.doFilter(request, response);
            return;
        }

        UsernamePasswordAuthenticationToken authentication =
                getAuthentication(request);

        SecurityContextHolder.getContext().setAuthentication(authentication);

        chain.doFilter(request, response);

        LOGGER.info("END");
    }

    private UsernamePasswordAuthenticationToken getAuthentication(
            HttpServletRequest request) {

        String token = request.getHeader("Authorization");

        if (token == null) {
            return null;
        }

        try {

            Jws<Claims> claims = Jwts.parserBuilder()
                    .setSigningKey(KEY)
                    .build()
                    .parseClaimsJws(token.replace("Bearer ", ""));

            String user = claims.getBody().getSubject();

            LOGGER.debug("User : {}", user);

            if (user != null) {

                return new UsernamePasswordAuthenticationToken(
                        user,
                        null,
                        new ArrayList<>());
            }

        } catch (JwtException e) {

            LOGGER.error("Invalid JWT");

            return null;
        }

        return null;
    }
}