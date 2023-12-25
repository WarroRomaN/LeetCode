package com.leetcode;

import com.leetcode.model.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new ListNode(2, new ListNode(4, new ListNode(3))),
                        new ListNode(5, new ListNode(6, new ListNode(4))),
                        new ListNode(7, new ListNode(0, new ListNode(8)))),
                Arguments.of(new ListNode(0), new ListNode(0), new ListNode(0)),
                Arguments.of(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                                new ListNode(9, new ListNode(9, new ListNode(9))))))),
                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
                        new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9,
                                new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))

                )
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        Assertions.assertEquals(expected, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}


