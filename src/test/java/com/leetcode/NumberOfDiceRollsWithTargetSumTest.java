package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberOfDiceRollsWithTargetSumTest {

    NumberOfDiceRollsWithTargetSum numberOfDiceRollsWithTargetSum = new NumberOfDiceRollsWithTargetSum();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(1, 6, 3, 1),
                Arguments.of(2, 6, 7, 6),
                Arguments.of(30, 30, 500, 222616187)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testNumRollsToTarget(int n, int k, int target, int expected) {
        Assertions.assertEquals(expected, numberOfDiceRollsWithTargetSum.numRollsToTarget(n, k, target));
    }

}
