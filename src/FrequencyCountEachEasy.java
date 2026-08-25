import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FrequencyCountEachEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap is the standard choice for O(1) speed
        HashMap<Integer, Integer> freq = new HashMap<>();
        System.out.println("enter size of list");
        int n = sc.nextInt();
        System.out.println("enter each and enter");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (!freq.containsKey(x)) {
                freq.put(x, 1);
            } else {
                int currentFrq = freq.get(x);
                freq.put(x, currentFrq + 1);

            }
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " " + freq.get(key));
        }
    }
}
