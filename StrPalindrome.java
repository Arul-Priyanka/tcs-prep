import java.util.*;

public class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int left = 0;
        int right = s.length() - 1;
        boolean palindrome = true;

        // charAt(index) , i == n-i
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(palindrome);

        sc.close();
    }
}
