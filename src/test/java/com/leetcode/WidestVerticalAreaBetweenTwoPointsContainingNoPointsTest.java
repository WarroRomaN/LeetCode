package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
    WidestVerticalAreaBetweenTwoPointsContainingNoPoints widestVerticalAreaBetweenTwoPointsContainingNoPoints =
            new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}}, 1),
                Arguments.of(new int[][]{{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMaxWidthOfVerticalArea(int[][] points, int expected) {
        Assertions.assertEquals(expected,
                widestVerticalAreaBetweenTwoPointsContainingNoPoints.maxWidthOfVerticalArea(points));
    }
}
