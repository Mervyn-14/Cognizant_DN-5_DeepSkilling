package com.cognizant;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.Country;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @GetMapping("/countries")
    public List<Country> getAllCountries() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList =
                context.getBean("countryList", List.class);

        LOGGER.info("END");

        return countryList;
    }
}