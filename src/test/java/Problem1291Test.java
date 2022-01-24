import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class Problem1291Test {


    static public Stream<? extends Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(100, 300, List.of(123, 234)),
                Arguments.of(1000, 13000, List.of(1234, 2345, 3456, 4567, 5678, 6789, 12345)),
                Arguments.of(10, 10, List.of()),
                Arguments.of(178546104, 812704742, List.of())
        );
    }


    @ParameterizedTest
    @MethodSource("provideArguments")
    public void test1(int low, int high, List expected) {
        Assertions.assertEquals(expected, new Problem1291().sequentialDigits(low, high));

    }

}
