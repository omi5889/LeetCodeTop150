package problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class P0153SumTest {
    @ParameterizedTest
    @MethodSource("threeSumTestCases")
    void threeSum(int[] nums, List<List<Integer>> expected) {
        P0153Sum obj = new P0153Sum();
        System.out.println(obj.threeSum(nums));
        System.out.println(expected);
    }
    private static Stream<Arguments> threeSumTestCases() {
        return Stream.of(
                Arguments.of(new int[]{-1,0,1,2,-1,-4}, Arrays.asList(new int[][]{{-1,-1,2},{-1,0,1}}))
        );
    }
}