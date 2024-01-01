package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AssignCookiesTest {

    AssignCookies assignCookies = new AssignCookies();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 1}, 1),
                Arguments.of(new int[]{1, 2}, new int[]{1, 2, 3}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testFindContentChildren(int[] g, int[] s, int expected) {
        Assertions.assertEquals(expected, assignCookies.findContentChildren(g, s));
    }
}
