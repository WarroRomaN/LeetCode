package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LargestNumberTest {
    LargestNumber largestNumber = new LargestNumber();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{10, 2}, "210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testLargestNumber(int[] nums, String expected) {
        Assertions.assertEquals(expected, largestNumber.largestNumber(nums));
    }
}
