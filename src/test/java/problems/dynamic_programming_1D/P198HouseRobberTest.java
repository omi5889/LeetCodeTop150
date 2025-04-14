package problems.dynamic_programming_1D;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P198HouseRobberTest {
    @ParameterizedTest
    @MethodSource("houseRobberTestCases")
    public void houseRobber(int[] n, int expected) {
        P198HouseRobber obj = new P198HouseRobber();
        assertEquals(expected, obj.rob(n));
    }
    private static Stream<Arguments> houseRobberTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,1}, 4),
                Arguments.of(new int[]{2,7,9,3,1}, 12)
        );
    }
}