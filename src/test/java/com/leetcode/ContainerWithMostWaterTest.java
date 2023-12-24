package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMaxArea(int[] height, int expected) {
        Assertions.assertEquals(expected, containerWithMostWater.maxArea(height));
    }
}
