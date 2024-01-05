package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/longest-increasing-subsequence/">
 * Longest Increasing Subsequence
 * </a>
 */

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] tmp = new int[nums.length];
        int res = 0;

        for (int num : nums) {
            int len = binarySearch(tmp, res, num);
            tmp[len] = num;
            if (len == res) {
                res++;
            }
        }

        return res;
    }

    private int binarySearch(int[] tmp, int end, int target) {
        int start = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (tmp[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
