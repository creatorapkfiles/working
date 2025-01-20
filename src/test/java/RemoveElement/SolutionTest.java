package RemoveElement;

import org.junit.jupiter.api.Test;
import static java.util.Arrays.sort;

class SolutionTest {

    @Test
    void removeElement() {
        Solution solution = new Solution();

        int [] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int [] expected = new int[]{2, 2};

        int k = solution.removeElement(nums, val);

        assert k == expected.length;
        sort(nums, 0, k);
        for (int i = 0; i < expected.length; i++) {
            assert nums[i] == expected[i];
        }
    }
}