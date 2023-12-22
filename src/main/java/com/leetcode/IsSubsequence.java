package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/is-subsequence/">Is Subsequence</a>
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for (char c : s.toCharArray()) {
            int tmp = t.substring(index).indexOf(c);
            if (tmp == -1) {
                return false;
            }
                index = index + 1 + tmp;

        }
        return true;
    }
}
