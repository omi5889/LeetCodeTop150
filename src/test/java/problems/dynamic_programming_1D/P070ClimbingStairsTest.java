package problems.dynamic_programming_1D;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P070ClimbingStairsTest {
    @ParameterizedTest
    @MethodSource("climbStairsTestCases")
    void climbStairs(int n, int expected) {
        P070ClimbingStairs obj = new P070ClimbingStairs();
        assertEquals(expected, obj.climbStairs(n));
    }
    private static Stream<Arguments> climbStairsTestCases() {
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(3,3)
        );
    }
}