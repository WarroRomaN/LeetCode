package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/two-sum/">
 * Two Sum
 * </a>
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }
}
