package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MajorityElementTest {

    MajorityElement majorityElement = new MajorityElement();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testMajorityElement(int[] nums, int expected) {
        Assertions.assertEquals(expected, majorityElement.majorityElement(nums));
    }

}
