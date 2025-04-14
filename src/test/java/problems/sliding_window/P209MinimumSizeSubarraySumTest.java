package problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P209MinimumSizeSubarraySumTest {
    @ParameterizedTest
    @MethodSource("minimumSizeSubarraySumTestCases")
    void minSubArrayLen(int target, int[] nums, int expected) {
        P209MinimumSizeSubarraySum obj = new P209MinimumSizeSubarraySum();
        assertEquals(expected, obj.minSubArrayLen(target, nums));
    }
    private static Stream<Arguments> minimumSizeSubarraySumTestCases() {
        return Stream.of(
                Arguments.of(7, new int[]{2,3,1,2,4,3}, 2),
                Arguments.of(4, new int[]{1,4,4}, 1)
        );
    }
}