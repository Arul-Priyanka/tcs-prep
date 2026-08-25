import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNo {
    public static int secondBig(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }
            else if( num > second && num != first){
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single integer (e.g., n): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers space-separated or line-by-line:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // FIX 2: Consume the leftover newline character in the scanner buffer
        sc.nextLine();
        System.out.print("Enter a string: ");
        String st = sc.nextLine();

        int res = secondBig(arr);
        System.out.printf("%d",res);
    }
}
