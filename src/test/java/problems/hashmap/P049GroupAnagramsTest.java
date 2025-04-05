package problems.hashmap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P049GroupAnagramsTest {
    @ParameterizedTest
    @MethodSource("groupAnagramsTestCases")
    void groupAnagramsTest(String[] strs, List<List<String>> expected) {
        P049GroupAnagrams obj = new P049GroupAnagrams();
        assertIterableEquals(expected, obj.groupAnagrams(strs));
    }
    private static Stream<Arguments> groupAnagramsTestCases() {
        return Stream.of(
                Arguments.of()
        );
    }

}