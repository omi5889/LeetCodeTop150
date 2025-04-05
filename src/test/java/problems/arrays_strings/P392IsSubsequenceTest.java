package problems.arrays_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P392IsSubsequenceTest {
    @ParameterizedTest
    @MethodSource("isSubsequenceTestCases")
    void isSubsequence(String s, String t, boolean expected ) {
        P392IsSubsequence obj = new P392IsSubsequence();
        assertEquals(expected, obj.isSubsequence(s, t));
    }
    private static Stream<Arguments> isSubsequenceTestCases() {
        return Stream.of(
                Arguments.of("abc","ahbgdc",true),
                Arguments.of("axc","ahbgdc",false),
                Arguments.of("","ahbgdc",true),
                Arguments.of("b","ahbgdc",true)
        );
    }
}