package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3}, new int[]{2}, 2.0),
                Arguments.of(new int[]{1, 2}, new int[]{3, 4}, 2.5)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testFindMedianSortedArrays(int[] nums1, int[] nums2, double expected) {
        Assertions.assertEquals(expected, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}
