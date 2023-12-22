package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MaximalRectangleTest {
    MaximalRectangle maximalRectangle = new MaximalRectangle();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}}, 6),
                Arguments.of(new char[][]{{'0'}},0),
                Arguments.of(new char[][]{{'1'}},1)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMaximalRectangle(char[][] matrix, int expected) {
        Assertions.assertEquals(expected, maximalRectangle.maximalRectangle(matrix));
    }
}
