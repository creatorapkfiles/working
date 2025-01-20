package LimonadeChange;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        if (1 <= bills.length && bills.length <= 100000) {
            for (int bill : bills) {
                if (bill == 5) five++;
                else if (bill == 10) {
                    if (five > 0) {
                        ten++;
                        five--;
                    } else return false;
                } else if (bill == 20) {
                    if (five > 0 && ten > 0) {
                        ten--;
                        five--;
                    } else if (five > 2) five = five - 3;
                    else return false;
                }
            }
        } else return false;
        return true;
    }

    public static void main(String[] args) {
        int [] bills = new int [5];
        bills[0] = 5;
        bills[1] = 5;
        bills[2] = 5;
        bills[3] = 10;
        bills[4] = 20;

        Solution solution = new Solution();
        System.out.println(solution.lemonadeChange(bills));
    }
}
