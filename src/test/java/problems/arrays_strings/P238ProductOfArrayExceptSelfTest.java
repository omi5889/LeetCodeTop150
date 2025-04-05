package problems.arrays_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P238ProductOfArrayExceptSelfTest {
    @ParameterizedTest
    @MethodSource("productExceptSelfTestCases")
    void productExceptSelf(int[] nums, int[] expected) {
        P238ProductOfArrayExceptSelf obj = new P238ProductOfArrayExceptSelf();
        int[] result = obj.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }
    private static Stream<Arguments> productExceptSelfTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4}, new int[]{24,12,8,6}),
                Arguments.of(new int[]{-1,1,0,-3,3}, new int[]{0,0,9,0,0})
        );
    }
}