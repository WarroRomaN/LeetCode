package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PathCrossingTest {

    PathCrossing pathCrossing = new PathCrossing();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("NES", false),
                Arguments.of("NESWW", true)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMaxWidthOfVerticalArea(String path, boolean expected) {
        Assertions.assertEquals(expected, pathCrossing.isPathCrossing(path));
    }

}
