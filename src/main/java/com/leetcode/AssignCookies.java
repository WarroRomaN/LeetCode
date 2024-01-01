package com.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/assign-cookies">
 * Assign Cookies
 * </a>
 */

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;

        }
        return count;
    }


}
