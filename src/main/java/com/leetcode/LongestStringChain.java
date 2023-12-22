package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @link <a href="https://leetcode.com/problems/longest-string-chain/description/">Longest String Chain</a>
 */
public class LongestStringChain {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, Comparator.comparingInt(String::length));
        Map<String, Integer> longestChainLength = new HashMap<>();
        int maxChainLength = -1;

        for (String word : words) {
            longestChainLength.put(word, 1);

            for (int i = 0; i < word.length(); i++) {
                String reducedWord = word.substring(0, i) + word.substring(i + 1);

                if (longestChainLength.containsKey(reducedWord))
                    longestChainLength.put(word, Math.max(longestChainLength.get(word), longestChainLength.get(reducedWord) + 1));
            }

            maxChainLength = Math.max(maxChainLength, longestChainLength.get(word));
        }

        return maxChainLength;
    }
}
