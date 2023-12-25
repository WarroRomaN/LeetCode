package com.leetcode;

import com.leetcode.model.ListNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @link <a href="https://leetcode.com/problems/add-two-numbers/">
 * Add Two Numbers
 * </a>
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<Integer> result = new LinkedList<>();
        int tmp = 0;
        do {
            tmp += (Objects.isNull(l1) ? 0 : l1.val) + (Objects.isNull(l2) ? 0 : l2.val);

            result.add(tmp % 10);
            tmp = tmp / 10;

            l1 = Objects.isNull(l1) ? l1 : l1.next;
            l2 = Objects.isNull(l2) ? l2 : l2.next;

        } while (l1 != null || l2 != null);

        if (tmp == 1) {
            result.add(1);
        }

        Collections.reverse(result);
        ListNode r = new ListNode(result.removeFirst());
        for (Integer i : result) {
            r = new ListNode(i, r);
        }

        return r;
    }

}
