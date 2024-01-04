package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MinimumNumberOfOperationsToMakeArrayEmptyTest {

    MinimumNumberOfOperationsToMakeArrayEmpty minimumNumberOfOperationsToMakeArrayEmpty =
            new MinimumNumberOfOperationsToMakeArrayEmpty();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4}, 4),
                Arguments.of(new int[]{2, 1, 2, 2, 3, 3}, -1),
                Arguments.of(new int[]{14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12}, 7),
                Arguments.of(new int[]{1, 14, 1, 1, 1}, -1));
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMinOperations(int[] nums, int expected) {
        Assertions.assertEquals(expected, minimumNumberOfOperationsToMakeArrayEmpty.minOperations(nums));
    }
}
