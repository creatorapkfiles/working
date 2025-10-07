package addBinary;

public class Solution {
    public String addBinary(String a, String b) {
        int one = Integer.parseInt(a, 2);
        int two = Integer.parseInt(b, 2);
        int sum = one + two;
        return Integer.toBinaryString(sum);
    }
}
