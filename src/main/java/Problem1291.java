import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/sequential-digits/
 *
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 *
 *
 * Example 1:
 *
 * Input: low = 100, high = 300
 * Output: [123,234]
 * Example 2:
 *
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 *
 *
 * Constraints:
 *
 * 10 <= low <= high <= 10^9
 */

public class Problem1291 {
    public static final List<Integer> ALL = Arrays.asList(12, 23, 34, 45, 56, 67, 78, 89, 123, 234, 345, 456, 567, 678, 789, 1234, 2345, 3456, 4567, 5678, 6789, 12345, 23456, 34567, 45678, 56789, 123456, 234567, 345678, 456789, 1234567, 2345678, 3456789, 12345678, 23456789, 123456789);

    public List<Integer> sequentialDigits(int low, int high) {
        int last = 35;

        if (low > ALL.get(last) || high < ALL.get(0)) {
            return new ArrayList<>();
        }
        int first = 0;

        while (ALL.get(first) < low) {
            first++;
        }
        while (ALL.get(last) > high) {

            last--;
        }
        return ALL.subList(first, 1 + last);
    }
}

