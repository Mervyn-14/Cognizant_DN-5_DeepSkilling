package com.exmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData(anyInt()))
                .thenReturn("Mock Data");

        Service service = new Service(mockApi);

        String result = service.fetchData(100);

        assertEquals("Mock Data", result);

        verify(mockApi).getData(anyInt());
    }
}