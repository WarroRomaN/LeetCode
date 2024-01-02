package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/">
 * Convert an Array Into a 2D Array With Conditions
 * </a>
 */

public class ConvertArrayInto2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(nums[0]);
        int count = 0, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count < max) {
                    result.get(count).add(nums[i]);
                } else {
                    result.add(new ArrayList<>());
                    result.get(count).add(nums[i]);
                    max++;
                }

            } else {
                count = 0;
                result.get(count).add(nums[i]);
            }
        }
        return result;
    }
}
