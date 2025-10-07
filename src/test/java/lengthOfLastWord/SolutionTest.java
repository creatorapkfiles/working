package lengthOfLastWord;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Assertions {
    @Test
    void lengthOfLastWord() {
    Solution s = new Solution();
    assertEquals(s.lengthOfLastWord("Hello World"), 5);
    }
    @Test
    void lengthOfLastWord2() {
        Solution s = new Solution();
        assertEquals(s.lengthOfLastWord("  fly me  to  the moon "), 4);
    }
    @Test
    void lengthOfLastWord3() {
        Solution s = new Solution();
        assertEquals(s.lengthOfLastWord("luffy id still joyboy"), 6);
    }
}