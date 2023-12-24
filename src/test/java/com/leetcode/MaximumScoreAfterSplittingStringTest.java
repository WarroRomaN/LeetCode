package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximumScoreAfterSplittingStringTest {
    MaximumScoreAfterSplittingString maximumScoreAfterSplittingString = new MaximumScoreAfterSplittingString();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("011101", 5),
                Arguments.of("00111", 5),
                Arguments.of("1111", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMaxScore(String s, int expected) {
        Assertions.assertEquals(expected, maximumScoreAfterSplittingString.maxScore(s));
    }
}
