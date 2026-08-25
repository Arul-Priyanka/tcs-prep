public class FibonacciSeries {
    public static int[] fiboSeriesOfN(int n){
        int a = 0,b =1;
        int[] fibo = new int[n];
        fibo[0] = a;
        fibo[1] = b;
        for(int i = 2;i<n;i++){
            int next = a + b;
            a = b;
            b = next;
            fibo[i] = next;
        }
        return fibo;
    }

    public static void main(String[] args) {
        int[] mylist = fiboSeriesOfN(5);
//        System.out.print();
        for(int num : mylist){
            System.out.print(num+" ");
        }
    }
}
