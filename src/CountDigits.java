public class CountDigits {
    public static int countDigits(int n){
        int original = n;
        int count = 0;
        if(n == 0){
            count = 1;
        }
        else {
            n = Math.abs(n);
            while (n >0){
                n/=10;
                count++;
            }
        }
        return count;
    }

    public static int power(int base,int exponent){
        int result = 1;
        for(int i = 0; i<exponent;i++){
            result *= base;

        }
        return result;
    }

    public static boolean isArmstrong(int n){
        int original =n;
        int sum = 0;
        int count = countDigits(n);
        while(n>0){
            int digit = n % 10;
            sum += Math.pow(digit,count);
            n/=10;
        }
        if (original != sum){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int cnt = countDigits(546);
        System.out.printf("%d",cnt);

        boolean arm = isArmstrong(92727);
        System.out.printf("%b",arm);


    }

}
