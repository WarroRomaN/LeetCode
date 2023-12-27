package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MergeStringsAlternatelyTest {

    MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("abc", "pqr", "apbqcr"),
                Arguments.of("ab", "pqrs", "apbqrs"),
                Arguments.of("abcd", "pq", "apbqcd")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMergeAlternately(String word1, String word2, String expected) {
        Assertions.assertEquals(expected, mergeStringsAlternately.mergeAlternately(word1, word2));
    }
}
