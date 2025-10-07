package ValidParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest extends Assertions {
    @Test
    public void test1(){
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
    }
    @Test
    public void test2(){
        Solution solution = new Solution();
        assertFalse(solution.isValid("(}"));
    }
    @Test
    public void test3(){
        Solution solution = new Solution();
        assertFalse(solution.isValid("([)]"));
    }
    @Test
    public void test4(){
        Solution solution = new Solution();
        assertTrue(solution.isValid("()[]{}"));
    }
    @Test
    public void test5(){
        Solution solution = new Solution();
        assertTrue(solution.isValid("([])"));
    }

}