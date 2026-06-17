package com.exmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {
        Repositary mockRepository = mock(Repositary.class);
        when(mockRepository.getData())
                .thenReturn("Mock Data");

        Service service = new Service(mockRepository);
        String result = service.processData();

        assertEquals("Processed Mock Data", result);
    }
}