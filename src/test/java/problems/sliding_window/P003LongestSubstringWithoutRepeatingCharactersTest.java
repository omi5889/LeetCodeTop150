package problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P003LongestSubstringWithoutRepeatingCharactersTest {
    @ParameterizedTest
    @MethodSource("longestSubstringTestCases")
    void longestSubstring(String s, int expected) {
        P003LongestSubstringWithoutRepeatingCharacters obj = new P003LongestSubstringWithoutRepeatingCharacters();
        assertEquals(expected, obj.lengthOfLongestSubstring(s));
    }
    private static Stream<Arguments> longestSubstringTestCases() {
        return Stream.of(
                Arguments.of("abcabcbb",3),
                Arguments.of("bbbbb",1),
                Arguments.of("pwwkew",3),
                Arguments.of("abba",2),
                Arguments.of("au",2)
        );
    }
}