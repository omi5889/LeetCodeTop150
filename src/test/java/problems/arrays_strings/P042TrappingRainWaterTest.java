package problems.arrays_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P042TrappingRainWaterTest {
    @ParameterizedTest
    @MethodSource("trappingRainWaterTestCases")
    void trappingRainWater(int[] height, int expected) {
        P042TrappingRainWater test = new P042TrappingRainWater();
        assertEquals(expected, test.trap(height));
    }
    private static Stream<Arguments> trappingRainWaterTestCases() {
        return Stream.of(
                Arguments.of(new int[]{0,1,0,2,1,0,1,3,2,1,2,1},6),
                Arguments.of(new int[]{4,2,0,3,2,5},9)
        );
    }

}