package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/majority-element/">
 * Majority Element
 * </a>
 */

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int res = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int tmp = nums[i], count = 1;
            nums[i] = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0) {
                    continue;
                }
                if (nums[j] == tmp) {
                    count++;
                    nums[j] = 0;
                }
            }

            if (count > nums.length / 2) {
                return tmp;
            }

            if (count > max) {
                res = tmp;
                max = count;
            }
        }

        return res;
    }

}
