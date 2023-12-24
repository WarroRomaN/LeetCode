package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/">
 * Minimum Changes To Make Alternating Binary String
 * </a>
 */

public class MinimumChangesToMakeAlternatingBinaryString {

    public int minOperations(String s) {
        char[] chars = s.toCharArray();

        int a = 0;
        int b = 0;

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                if (chars[i] == '1') {
                    a++;
                } else {
                    b++;
                }
            } else {
                if (chars[i] == '1') {
                    b++;
                } else {
                    a++;
                }
            }
        }
        return Math.min(a, b);
    }
}
