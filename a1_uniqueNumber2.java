import java.sql.Array;
import java.util.Arrays;

public class a1_uniqueNumber2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(singleNum(arr));
        System.out.println(Arrays.toString(singleNum(arr)));
    }

    public static int[] singleNum (int[] arr) {
        int res = 0;
        for(int num: arr) {
            res = res ^ num;
        }
        int x = 0;
        int y = 0;
        int rsb = res & -res;
        for (int num: arr) {
            if ((num & rsb) == 0) {
                x = x ^ num;
            } else {
                y = y ^ num;
            }
        }
        int[] ans = {x, y};
        Arrays.sort(ans);
        return ans;
    }

}
