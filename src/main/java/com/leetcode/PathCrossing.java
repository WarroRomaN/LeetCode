package com.leetcode;

/**
 * @link <a href="https://leetcode.com/problems/path-crossing/">
 * Path Crossing
 * </a>
 */

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        char[] cPath = path.toCharArray();

        int[] xs = new int[cPath.length + 1];
        int[] ys = new int[cPath.length + 1];

        xs[0] = 0;
        ys[0] = 0;

        for (int i = 0; i < cPath.length; i++) {
            if (cPath[i] == 'N') {
                xs[i + 1] = xs[i];
                ys[i + 1] = ys[i] + 1;
            } else if (cPath[i] == 'S') {
                xs[i + 1] = xs[i];
                ys[i + 1] = ys[i] - 1;
            } else if (cPath[i] == 'E') {
                xs[i + 1] = xs[i] + 1;
                ys[i + 1] = ys[i];
            } else {
                xs[i + 1] = xs[i] - 1;
                ys[i + 1] = ys[i];
            }
            for (int y = 0; y <= i; y++) {
                if (xs[y] == xs[i + 1] && ys[y] == ys[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}