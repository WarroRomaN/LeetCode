package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsSubsequenceTest {

    IsSubsequence isSubsequence = new IsSubsequence();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("twn", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxtxxxxxxxxxxxxxxxxxxxxwxxxxxxxxxxxxxxxxxxxxxxxxxn", true),
                Arguments.of("aaaaaa", "bbaaaa", false),
                Arguments.of("bb", "ahbgdc", false),
                Arguments.of("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testIsSubsequence(String s, String t, boolean expected) {
        Assertions.assertEquals(expected, isSubsequence.isSubsequence(s, t));
    }
}
