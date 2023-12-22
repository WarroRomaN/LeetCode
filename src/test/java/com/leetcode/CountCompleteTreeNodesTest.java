package com.leetcode;

import com.leetcode.model.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountCompleteTreeNodesTest {
    CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();


    public static Stream<Arguments> getTestData() {
        return Stream.of(


                Arguments.of(new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null)), 6),
                Arguments.of(new TreeNode(1), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testCountNodes(TreeNode root, int expected) {
        Assertions.assertEquals(expected, countCompleteTreeNodes.countNodes(root));
    }
}
