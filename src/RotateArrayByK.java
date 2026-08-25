public class RotateArrayByK {
    //Reverse the first $d$ elements (0 to d - 1).
    // Reverse the remaining $N - d$ elements (d to N - 1).
    // Reverse the entire array (0 to N - 1).
    public static int[] rotateArrLeft(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        //normalizing rotate times
        reverse(arr, 0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public static int[] rotateArrRight(int[] arr, int d){
        //Reverse the ENTIRE array first
        // Reverse the FIRST d elements
        // Reverse the REST of the elements
        int n = arr.length;
        d = d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        return arr;
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = rotateArrLeft(arr,2);
        // ADD THIS: Loop to display your results on the screen!
        for(int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr1 = {1,2,3,4,5};
        int[] res1 = rotateArrRight(arr1,2);
        for(int num : res1) {
            System.out.print(num + " ");
        }

    }
}
