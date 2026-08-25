//reverse
public class Reverse {
    public static int reverse(int val){
        int rev =0;
        while(val > 0){
            int digit = val % 10;
            rev = rev*10 + digit;
            val /= 10;
        }
    return rev;
    }
    public static boolean isPalindrome(int val){
        int rev = reverse(val);
        if (rev == val){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int myrev = reverse(546);
        System.out.printf("%d",myrev);

        boolean pal = isPalindrome(111);
        System.out.printf("%b",pal);

    }
}
