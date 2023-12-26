package com.leetcode;

import java.util.Arrays;

/**
 * @link <a href="https://leetcode.com/problems/number-of-dice-rolls-with-target-sum">
 * Number of Dice Rolls With Target Sum
 * </a>
 */

public class NumberOfDiceRollsWithTargetSum {

    public static final int MOD = (int) (Math.pow(10, 9) + 7);

    private int numRollsToTarget(int n, int k, int target, int[][] res) {
        if (n < 0 || target < 0) {
            return 0;
        }
        if (n == 0 && target == 0) {
            return 1;
        }
        if (res[n][target] != -1) {
            return res[n][target];
        }

        int sum = 0;

        for (int i = 1; i <= k; i++) {
            if (i <= target) {
                sum = (sum + numRollsToTarget(n - 1, k, target - i, res)) % MOD;
            }
        }
        res[n][target] = sum;
        return sum;
    }

    public int numRollsToTarget(int n, int k, int target) {

        int[][] res = new int[n + 1][target + 1];

        Arrays.stream(res).forEach(e -> Arrays.fill(e, -1));

        return numRollsToTarget(n, k, target, res);
    }

}
