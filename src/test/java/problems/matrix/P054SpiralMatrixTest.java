package problems.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class P054SpiralMatrixTest {
    @ParameterizedTest
    @MethodSource("spiralMatrixTestCases")
    void spiralOrder(int[][] matrix, List<Integer> expected) {
        P054SpiralMatrix spiral = new P054SpiralMatrix();
        assertIterableEquals(expected, spiral.spiralOrder(matrix));
    }
    private static Stream<Arguments> spiralMatrixTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, new ArrayList<>(asList(1,2,3,6,9,8,7,4,5)))

        );
    }
}