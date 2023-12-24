package com.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/largest-number/">
 * Largest Number
 * </a>
 */

public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums.length == 0)
            return "";
        if (nums.length == 1)
            return "" + nums[0];

        String[] stringArray = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringArray[i] = "" + nums[i];
        }

        Arrays.sort(stringArray, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });
        if (stringArray[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (String val : stringArray) {
            sb.append(val);
        }
        return sb.toString();
    }
}
