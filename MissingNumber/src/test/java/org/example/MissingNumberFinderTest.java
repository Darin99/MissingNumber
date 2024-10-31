package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberFinderTest {

    @Test
    public void testFindMissingNumber_NumberMissing() {
        int[] numbers = {0, 1, 2, 4, 5, 6, 7, 8, 9};
        assertMissingNumber(numbers, 3);
    }

    @Test
    public void testFindMissingNumber_FirstNumberMissing() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertMissingNumber(numbers, 0);
    }

    @Test
    public void testFindMissingNumber_LastNumberMissing() {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        assertMissingNumber(numbers, 9);
    }

    private void assertMissingNumber(int[] numbers, int expectedMissingNumber) {
        int missingNumber = MissingNumberFinder.findMissingNumber(numbers, 0, numbers.length - 1);
        Assertions.assertEquals(expectedMissingNumber, missingNumber);
    }
}