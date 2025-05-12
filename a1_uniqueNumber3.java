import java.util.HashMap;

public class a1_uniqueNumber3 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 1, 1};
        System.out.println(getSingle(arr));
    }
    public static int getSingle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
//            System.out.println(map);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}
