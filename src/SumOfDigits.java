public class SumOfDigits {
    public static void sumOfDigits(int n){
        int sum = 0,count = 0;
        while (n>0){
            int digit = n %10;
            sum += digit;
            count ++;
            n/=10;
        }
        System.out.println(count+" "+sum);
    }

    public static void main(String[] args) {
        sumOfDigits(1234);
    }
}
