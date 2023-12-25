package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class DecodeWaysTest {
    DecodeWays decodeWays = new DecodeWays();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("12", 2),
                Arguments.of("226", 3),
                Arguments.of("06", 0),
                Arguments.of("111111111111111111111111111111111111111111111",1836311903)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testNumDecodings(String s, int expected) {
        Assertions.assertEquals(expected, decodeWays.numDecodings(s));
    }
}
