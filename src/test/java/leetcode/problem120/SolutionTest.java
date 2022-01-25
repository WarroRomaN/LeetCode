package leetcode.problem120;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    static public Stream<? extends Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3)), 11),
                Arguments.of(List.of(List.of(-10)), -10)
        );
    }


    @ParameterizedTest
    @MethodSource("provideArguments")
    public void test(List<List<Integer>> triangle, int expected) {
        Assertions.assertEquals(expected, new Solution().minimumTotal(triangle));
    }

}
