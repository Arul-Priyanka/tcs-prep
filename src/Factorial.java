public class Factorial {
    public static int factorialOfNo(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
         fact *=i;
        }
        return fact;
    }

    public static int recursiveFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n*recursiveFactorial(n-1);
    }

    public static void main(String[] args) {
        int fact1 = recursiveFactorial(5);
        int fact2 = factorialOfNo(5);
        System.out.println(fact1+" "+" "+fact2);
    }
}
