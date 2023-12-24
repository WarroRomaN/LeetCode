package com.leetcode;

import com.leetcode.model.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PalindromeLinkedListTest {
    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))), true),
                Arguments.of(new ListNode(1, new ListNode(2)), false)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testIsPalindrome(ListNode head, boolean expected) {
        Assertions.assertEquals(expected, palindromeLinkedList.isPalindrome(head));
    }
}
