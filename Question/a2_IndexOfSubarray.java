package Question;

import java.util.Arrays;
import java.util.List;

public class a2_IndexOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        System.out.println(func(arr, 12));
    }
    public static List<Integer> func(int[] arr, int target) {
        int sum = 0; int start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum = sum - arr[start];
                start++;
            }
            if (sum == target) {
                return Arrays.asList(start+1, end+1);
            }
        }

        return Arrays.asList(-1);
    }
}
