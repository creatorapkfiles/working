package lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        if (array.length == 0) return 0;
        int count = array.length - 1;
        char[] chars = array[count].toCharArray();
        return chars.length;
    }
}
