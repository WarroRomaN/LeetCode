package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinimumChangesToMakeAlternatingBinaryStringTest {

    MinimumChangesToMakeAlternatingBinaryString minimumChangesToMakeAlternatingBinaryString =
            new MinimumChangesToMakeAlternatingBinaryString();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("0100", 1),
                Arguments.of("10", 0),
                Arguments.of("1111", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testIsSubsequence(String s, int expected) {
        Assertions.assertEquals(expected, minimumChangesToMakeAlternatingBinaryString.minOperations(s));
    }


}
