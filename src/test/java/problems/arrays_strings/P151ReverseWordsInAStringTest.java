package problems.arrays_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P151ReverseWordsInAStringTest {
    @ParameterizedTest
    @MethodSource("reverseWordsTestCases")
    void reverseWords(String s,String expected) {
        P151ReverseWordsInAString obj = new P151ReverseWordsInAString();
        assertEquals(expected, obj.reverseWords(s));
    }
    private static Stream<Arguments> reverseWordsTestCases() {
        return Stream.of(
                Arguments.of("the sky is blue","blue is sky the"),
                Arguments.of("  hello world  ","world hello"),
                Arguments.of("a good   example","example good a")
        );
    }

}