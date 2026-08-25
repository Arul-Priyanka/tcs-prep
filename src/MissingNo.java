import java.util.Scanner;
public class MissingNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N (the total count of numbers including the missing one)
        int n = sc.nextInt();
        long expectedSum = (long) n*(n+1)/2;
        long actualSum = 0;
        //The Fix: Change i < n to i < n - 1
        //cuz one number is missing so the size of sequnce is less
        for(int i =0;i<n-1;i++){
            actualSum+=sc.nextInt();
        }
        System.out.println(expectedSum - actualSum);

    }
}
