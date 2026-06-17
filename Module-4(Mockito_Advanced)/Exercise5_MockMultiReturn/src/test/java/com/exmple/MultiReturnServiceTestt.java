package com.exmple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MultiReturnServiceTestt {
    @Test
    void testServiceWithMultipleReturnValues() {
        Repository mockRepository = mock(Repository.class);

        when(mockRepository.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        Service service = new Service(mockRepository);

        String firstResult =service.processData();

        String secondResult = service.processData();

        assertEquals( "Processed First Mock Data",   firstResult);

        assertEquals( "Processed Second Mock Data",  secondResult);

        verify(mockRepository, times(2)) .getData();
    }
}