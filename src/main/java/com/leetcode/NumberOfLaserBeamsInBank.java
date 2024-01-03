package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/number-of-laser-beams-in-a-bank/">
 * Number of Laser Beams in a Bank
 * </a>
 */

public class NumberOfLaserBeamsInBank {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int result = 0;
        for (String s : bank) {
            int curr = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    curr++;
                }
            }

            if (curr != 0) {
                result += curr * prev;
                prev = curr;
            }
        }
        return result;
    }
}
