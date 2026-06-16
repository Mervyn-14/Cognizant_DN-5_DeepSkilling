package com.example;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
public class ExceptionThrowerTest {

    @Test
    void testExceptionThrown() {
        ExceptionThrower et = new ExceptionThrower();
        assertThrows(RuntimeException.class, () -> {
            et.throwException();
        });
    }
}