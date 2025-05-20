package _00_Arrays;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
//        System.out.println("Ali Ansari");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        int ans = getSum(arr);
        System.out.println("The total sum of Array is: "+ ans);
    }
    public static int getSum(int[] arr) {
        int result = 0;
        for (int num: arr) {
            result += num;
        }
        return result;
    }
}
