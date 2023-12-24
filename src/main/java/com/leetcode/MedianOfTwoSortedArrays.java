package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">
 * Median of Two Sorted Arrays
 * </a>
 */

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (index1 == nums1.length) {
                result[i] = nums2[index2];
                index2++;
                continue;
            }
            if (index2 == nums2.length) {
                result[i] = nums1[index1];
                index1++;
                continue;
            }
            if (nums1[index1] < nums2[index2]) {
                result[i] = nums1[index1];
                index1++;
            } else {
                result[i] = nums2[index2];
                index2++;
            }
        }
        if (result.length % 2 == 0) {
            return (result[result.length / 2] + result[result.length / 2 - 1]) / 2.0;
        }
        return result[result.length / 2];

    }
}
