package com.exmple;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceClassTest {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).saveData();

        ServiceClass service = new ServiceClass(mockApi);

        service.processData();

        verify(mockApi).saveData();
    }
}