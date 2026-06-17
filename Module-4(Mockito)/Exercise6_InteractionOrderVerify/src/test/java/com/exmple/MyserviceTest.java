package com.exmple;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class MyserviceTest {
    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        Myservice service = new Myservice(mockApi);

        service.processData();
        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).connect();
        inOrder.verify(mockApi).getData();
    }
}