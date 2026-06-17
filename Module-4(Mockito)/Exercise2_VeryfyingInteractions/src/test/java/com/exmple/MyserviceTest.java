package com.exmple;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyserviceTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        Myservice service = new Myservice(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}