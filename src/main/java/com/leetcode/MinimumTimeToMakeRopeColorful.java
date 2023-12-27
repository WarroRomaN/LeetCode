package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/minimum-time-to-make-rope-colorful/">
 * Minimum Time to Make Rope Colorful
 * </a>
 */

public class MinimumTimeToMakeRopeColorful {
    public int minCost(String colors, int[] neededTime) {
        char[] chars = colors.toCharArray();

        int res = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                res += Math.min(neededTime[i], neededTime[i + 1]);
                neededTime[i + 1] = Math.max(neededTime[i], neededTime[i + 1]);
            }
        }
        return res;
    }
}
