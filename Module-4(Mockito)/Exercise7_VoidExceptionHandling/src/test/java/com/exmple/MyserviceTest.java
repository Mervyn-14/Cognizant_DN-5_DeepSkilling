package com.exmple;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyserviceTest {
    @Test
    void testVoidMethodException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("API Error"))
                .when(mockApi)
                .saveData();
        Myservice service = new Myservice(mockApi);
        assertThrows(RuntimeException.class, () -> {
            service.processData();
        });
        verify(mockApi).saveData();
    }
}