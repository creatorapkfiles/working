package addBinary;

import java.math.BigInteger;
import java.util.Stack;

public class Solution {
    public String addBinary(String a, String b) {
        if(a.equals("0") & b.equals("0"))
            return "0";
        BigInteger aBig = new BigInteger(a, 2);
        BigInteger bBig = new BigInteger(b, 2);
        BigInteger res = aBig.add(bBig);

        return result(res);
    }
    private String result(BigInteger res){
        Stack<BigInteger> stack = new Stack<BigInteger>();
        StringBuilder sb = new StringBuilder();

        while(res.compareTo(BigInteger.ZERO)>0){
            stack.push(res.mod(new BigInteger("2")));
            res = res.divide(BigInteger.TWO);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
