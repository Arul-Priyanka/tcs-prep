import java.util.Arrays;

public class Prime {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        //instead of i  < sqrt(n) we say  i*i < n: reverse engineering woah
        for(int i = 2; i*i <=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimeUpTo(int n){
        if(n < 2){
            System.out.println("No prime numbers found below 2.");
            return;
        }
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);

        primes[0] = false;
        primes[1] =false;
        for(int i =2;i*i<=n;i++){
            if(primes[i]){
                for(int j = i*i;j<=n;j+=i){
                    primes[j] = false;
                }
            }
        }
    System.out.println("Prime numbers up to " + n + ":");
        for(int i =2;i<=n;i++){
            if(primes[i]){
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        boolean cnt = isPrime(17);
        System.out.printf("%b",cnt);

        findPrimeUpTo(17);
    }

}
