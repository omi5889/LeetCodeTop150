package problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P011ContainerWithMostWaterTest {
    @ParameterizedTest
    @MethodSource("containerWithMostWaterTestCases")
    void containerWithMostWaterTest(int[] height,int expected) {
        P011ContainerWithMostWater obj = new P011ContainerWithMostWater();
        assertEquals(expected,obj.maxArea(height));
    }
    private static Stream<Arguments> containerWithMostWaterTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,8,6,2,5,4,8,3,7}, 49)
        );
    }
}