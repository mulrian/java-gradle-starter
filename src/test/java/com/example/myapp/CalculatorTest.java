package com.example.myapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void simpleAddition() {
        var calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    void add(int first, int second, int expectedResult) {
        var calculator = new Calculator();
        assertEquals(expectedResult, calculator.add(first, second), first + " + " + second + " should equal " + expectedResult);
    }
}
