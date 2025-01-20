package KthDistinctString;

public class Solution {
    public String kthDistinct(String[] arr, int k) {
        String string = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (i != j) {

                    if (arr[i] != arr[j]) {
                        string = arr[i];
                        if (count == k) {
                            return string;
                        } else {
                            return "";
                        }
                    }
                }

            }
        }
        return string;
    }
}
