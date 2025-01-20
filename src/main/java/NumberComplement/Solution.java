package NumberComplement;

import javax.xml.transform.Transformer;
import java.util.ArrayList;
import java.util.List;

public class Solution {
//    public int findComplement(int num) {
//        int res = 0, num1 = num;
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder stringBuilder1 = new StringBuilder();
//        while (num1 != 0) {
//            res = num1 % 2;
//            num1 /= 2;
//            stringBuilder.append(res);
//        }
//        stringBuilder.reverse();
//
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            if (stringBuilder.charAt(i) == '1') {
//                stringBuilder1.append(0);
//            } else if (stringBuilder.charAt(i) == '0') {
//                stringBuilder1.append(1);
//            }
//        }
//
//        stringBuilder1.reverse();
//        System.out.println(stringBuilder1);
//        res = 0;
//        for (int i = 0; i < stringBuilder1.length(); i++) {
//            res = res + (int) (Integer.parseInt(String.valueOf(stringBuilder1.charAt(i))) * Math.pow(2, i));
//        }
//
//        return res;
//    }

    public int findComplement(int num) {
        int m=(Integer.highestOneBit(num)<<1)-1;
        return num^m;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findComplement(6));
    }
}
