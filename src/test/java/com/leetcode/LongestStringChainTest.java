package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LongestStringChainTest {

    LongestStringChain longestStringChain = new LongestStringChain();
    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new String[]{"a","b","ba","bca","bda","bdca"}, 4),
                Arguments.of(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"}, 5),
                Arguments.of(new String[]{"abcd","dbqca"}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testLongestStrChain(String[] words, int expected) {
        Assertions.assertEquals(expected, longestStringChain.longestStrChain(words));
    }
}
