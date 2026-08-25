public class Gcd {
    //GCD(a,b) = GCD(a,a%b)
public static int findGCD(int a,int b){
    while(b != 0){
        int r = a%b;
        a= b;
        b= r;
    }
    return a;
}

    public static void main(String[] args) {
        int cnt = findGCD(2500,6700);
        System.out.printf("%d",cnt);

    }
}

