package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinimumTimeToMakeRopeColorfulTest {
    MinimumTimeToMakeRopeColorful minimumTimeToMakeRopeColorful = new MinimumTimeToMakeRopeColorful();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("abaac", new int[]{1, 2, 3, 4, 5}, 3),
                Arguments.of("abc", new int[]{3}, 0),
                Arguments.of("aabaa", new int[]{1, 2, 3, 4, 1}, 2),
                Arguments.of("aaabbbabbbb", new int[]{3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1}, 26)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMinCost(String colors, int[] neededTime, int expected) {
        Assertions.assertEquals(expected, minimumTimeToMakeRopeColorful.minCost(colors, neededTime));
    }
}
