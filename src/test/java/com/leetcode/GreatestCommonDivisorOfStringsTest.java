package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GreatestCommonDivisorOfStringsTest {
    GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("ABCABC", "ABC", "ABC"),
                Arguments.of("ABABAB", "ABAB", "AB"),
                Arguments.of("LEET", "CODE", ""),
                Arguments.of("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX","TAUXX"),
                Arguments.of("ABABCCABAB","ABAB","")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testGCDOfStrings(String str1, String str2, String expected) {
        Assertions.assertEquals(expected, greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
    }
}
