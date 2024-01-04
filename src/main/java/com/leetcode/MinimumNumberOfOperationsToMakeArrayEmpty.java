package com.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/">
 * Minimum Number of Operations to Make Array Empty
 * </a>
 */

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return -1;
        }
        if (nums[0] != nums[1]) {
            return -1;
        }

        int count = 1, res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                count++;
            } else if (nums[i - 1] == nums[i]) {
                count++;
                continue;
            }

            if (count == 1) {
                return -1;
            } else if (count == 2 || count == 3) {
                res++;
            } else {
                if (count % 3 == 0) {
                    res += count / 3;
                } else if (count % 3 == 2) {
                    res += count / 3;
                    res++;
                } else {
                    res += 2;
                    res += (count - 4) / 3;
                }
            }
            count = 1;

        }
        return res;
    }
}
