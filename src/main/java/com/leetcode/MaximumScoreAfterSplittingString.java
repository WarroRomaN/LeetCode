package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/">
 * Maximum Score After Splitting a String
 * </a>
 */

public class MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int maxScore = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            int score = 0;
            for (int j = 0; j <= i; j++) {
                if (chars[j] == '0')
                    score++;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == '1')
                    score++;
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }
}
