package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">
 * Greatest Common Divisor of Strings
 * </a>
 */

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        for (int i = Math.min(str1.length(), str2.length()); i > 0; i--) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                String tmp = str1.substring(0, i);
                if (str1.replaceAll(tmp, "").isEmpty()
                        && str2.replaceAll(tmp, "").isEmpty()) {
                    return tmp;
                }
            }
        }
        return "";
    }

}
