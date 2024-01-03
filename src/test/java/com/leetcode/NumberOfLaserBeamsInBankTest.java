package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class NumberOfLaserBeamsInBankTest {
    NumberOfLaserBeamsInBank numberOfLaserBeamsInBank = new NumberOfLaserBeamsInBank();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new String[]{"011001", "000000", "010100", "001000"}, 8),
                Arguments.of(new String[]{"000", "111", "000"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testNumberOfBeams(String[] bank, int expected) {
        Assertions.assertEquals(expected, numberOfLaserBeamsInBank.numberOfBeams(bank));
    }
}
