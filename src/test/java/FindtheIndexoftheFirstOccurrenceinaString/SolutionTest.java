package FindtheIndexoftheFirstOccurrenceinaString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void strStr() {
        Solution s = new Solution();
        int out = s.strStr("sadbutsad", "sad");
        Assertions.assertEquals(0, out);
    }
    @Test
    void strStr1() {
        Solution s = new Solution();
        int out = s.strStr("leetcode", "leeto");
        Assertions.assertEquals(-1, out);
    }
}