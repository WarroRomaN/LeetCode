package com.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/">Widest Vertical Area Between Two Points Containing No Points</a>
 */

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {

    public int maxWidthOfVerticalArea(int[][] points) {

        int[] xPoint = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            xPoint[i] = points[i][0];
        }
        Arrays.sort(xPoint);
        int maxWidth = 0;
        for (int i = 0; i < xPoint.length - 1; i++) {
            maxWidth = Math.max(maxWidth, xPoint[i + 1] - xPoint[i]);
        }
        return maxWidth;
    }
}
