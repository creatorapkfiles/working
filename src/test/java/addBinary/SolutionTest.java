package addBinary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Assertions {
    @Test
    void addBinary() {
        Solution s = new Solution();
        assertEquals("100", s.addBinary("11", "1"));
    }
    @Test
    void addBinary1() {
        Solution s = new Solution();
        assertEquals("10101", s.addBinary("1010", "1011"));
    }
    @Test
    void addBinary2() {
        Solution s = new Solution();
        assertEquals("0", s.addBinary("0", "0"));
    }
    @Test
    void addBinary3() {
        Solution s = new Solution();
        assertEquals("1", s.addBinary("0", "1"));
    }
}