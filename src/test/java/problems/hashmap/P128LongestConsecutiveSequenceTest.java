package problems.hashmap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P128LongestConsecutiveSequenceTest {
    @ParameterizedTest
    @MethodSource("longestConsecutiveTestCases")
    void longestConsecutiveSequenceTest(int[] nums, int expected) {
        P128LongestConsecutiveSequence obj = new P128LongestConsecutiveSequence();
        assertEquals(expected, obj.longestConsecutive(nums));
    }
    private static Stream<Arguments> longestConsecutiveTestCases() {
        return Stream.of(
                Arguments.of(new int[]{100,4,200,1,3,2},4),
                Arguments.of(new int[]{0,3,7,2,5,8,4,6,0,1},9),
                Arguments.of(new int[]{1,0,1,2},3)
        );
    }
}