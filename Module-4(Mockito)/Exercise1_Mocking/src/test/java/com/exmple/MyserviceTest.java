package com.exmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyserviceTest {

    @Test
    void testExternalApi() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        Myservice service = new Myservice(mockApi);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}