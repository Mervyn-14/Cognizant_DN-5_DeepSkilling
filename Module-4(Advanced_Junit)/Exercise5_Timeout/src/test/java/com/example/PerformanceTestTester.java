package com.example;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

import com.example.PerformanceTest;

public class PerformanceTestTester {

    @Test
    void testPerformance() {

        PerformanceTest tester = new PerformanceTest();

        assertTimeout(Duration.ofSeconds(1), () -> {
            tester.performTask();
        });
    }
}