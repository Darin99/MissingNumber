package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int missingNumber = findMissingNumber(numbers, 0, numbers.length - 1);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] numbers, int left, int right) {
        if (left > right) {
            return left;
        }

        int midIndex = left + (right - left) / 2;

        if (numbers[midIndex] == midIndex) {
            return findMissingNumber(numbers, midIndex + 1, right);
        } else {
            return findMissingNumber(numbers, left, midIndex - 1);
        }
    }
}
