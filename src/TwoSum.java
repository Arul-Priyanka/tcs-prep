import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            int required = target - current;
            if(seenNumbers.contains(required)){
                System.out.println("Pair found");
                found = true;
                break;
            }
            seenNumbers.add(current);
        }
        if(!found){
            System.out.println("no pair");
        }
    }
}