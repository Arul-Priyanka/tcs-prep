//product property of two numbers
//A x B =lcm x gcd
//so
//lcm = (A X B )/ gcd
public class Lcm {
    public static int findLcm(int a, int b){
        int x = a, y = b;
        while(y != 0){
            int r = x%y;
            x = y;
            y = r;

        }
        int gcd = x;
        int lcm = (a/gcd)*b;
        //to prevent integer overflow
        //int lcm = (a*b)/gcd;
        return lcm;
    }

    public static void main(String[] args) {
        int cnt = findLcm(2500,6700);
        System.out.printf("%d",cnt);

    }
}
