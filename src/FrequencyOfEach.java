import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> freq = new HashMap<>();
        int n = sc.nextInt();
        for(int i =0;i <n;i++){
            freq.merge(sc.nextInt(),1,Integer::sum);
        }
        freq.forEach((key,val) -> System.out.println(key+" "+" "+val));
    }
}
