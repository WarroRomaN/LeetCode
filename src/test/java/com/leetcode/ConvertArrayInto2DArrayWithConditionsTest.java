package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class ConvertArrayInto2DArrayWithConditionsTest {
    ConvertArrayInto2DArrayWithConditions convertArrayInto2DArrayWithConditions =
            new ConvertArrayInto2DArrayWithConditions();

    public static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4, 1, 2, 3, 1}, List.of(List.of(1, 2, 3, 4), List.of(1, 3), List.of(1)))
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    public void testFindMatrix(int[] nums, List<List<Integer>> expected) {
        Assertions.assertEquals(expected, convertArrayInto2DArrayWithConditions.findMatrix(nums));
    }
}
