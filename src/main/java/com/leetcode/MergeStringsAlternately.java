package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/merge-strings-alternately/">
 * Merge Strings Alternately
 * </a>
 */

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        char[] result = new char[chars1.length + chars2.length];

        for (int i = 0, y = 0; i < Math.max(chars1.length, chars2.length); i++) {
            if (i < chars1.length) {
                result[y++] = chars1[i];
            }
            if (i < chars2.length) {
                result[y++] = chars2[i];
            }
        }

        return new String(result);
    }

}
