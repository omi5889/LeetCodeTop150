package problems.arrays_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P169MajorityElementTest {
    @ParameterizedTest
    @MethodSource("majorityElementTestCases")
    void testMajorityElement(int[] nums, int expected) {
        P169MajorityElement obj = new P169MajorityElement();
        int result = obj.majorityElement(nums);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> majorityElementTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3,2,3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }
}