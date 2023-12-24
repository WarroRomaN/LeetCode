package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/container-with-most-water/">
 * Container With Most Water
 * </a>
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = height.length - 1; j > i; j--) {
                if (height[i] > height[j]) {
                    int v = (j - i) * height[j];
                    if (v > max) {
                        max = v;
                    }
                } else {
                    int v = (j - i) * height[i];
                    if (v > max) {
                        max = v;
                    }
                    break;
                }
            }
        }
        return max;
    }
}
