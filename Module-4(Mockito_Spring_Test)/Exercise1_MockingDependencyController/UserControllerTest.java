package com.exmple;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class UserControllerTest {

    @Test
    void testGetUser() {

        UserService mockUserService = mock(UserService.class);

        User user =
                new User(1L, "Mervyn");

        when(mockUserService.getUserById(1L))
                .thenReturn(user);

        UserController controller =
                new UserController(mockUserService);

        ResponseEntity<User> response =
                controller.getUser(1L);

        assertNotNull(response);

        assertEquals(
                1L,
                response.getBody().getId());

        assertEquals(
                "Mervyn",
                response.getBody().getName());

        verify(mockUserService)
                .getUserById(1L);
    }
}