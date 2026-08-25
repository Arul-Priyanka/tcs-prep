import java.util.HashMap;

public class TwoSumPair {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,3};
        int n = arr.length;
        int target = 8;
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean found  =false;

        for(int i = 0;i<n;i++){
            int current = arr[i];
            int requiredPair = target - current;
            if(map.containsKey(requiredPair)){
                int pairedIndex = map.get(requiredPair);

                System.out.println("index as "+ pairedIndex + " "+ i);
                found =true;
                break;
                //return new int[]{pairedIndex,i};
            }
            map.put(current,i);
        }
        if(!found){
            System.out.println("No matching indices found");
            //return new int[]{-1,-1};
        }
    }
}
