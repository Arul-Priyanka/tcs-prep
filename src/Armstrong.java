public class Armstrong {
    public static boolean isArmstrong(int n){
        //153 = 1³ + 5³ + 3³ = 153
        // the sum of cube of digits
        //an integer that equals the sum of its own digits
        // each raised to the power of the total number of digits
        int original = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (original != sum){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean pal = isArmstrong(153);
        System.out.printf("%b",pal);

    }

}

