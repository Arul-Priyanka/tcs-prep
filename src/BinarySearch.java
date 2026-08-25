public class BinarySearch {
    //If arr[mid] == k, return mid.
    //If arr[mid] < k, search the right half (low = mid + 1).
    //If arr[mid] > k, search the left half (high = mid - 1).

    public static int binarySearch(int[] arr, int ele){
        int low = 0,high = arr.length -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == ele){
                return mid;
            } else if (arr[mid]> ele) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int res = binarySearch(arr,5);
        System.out.println(res);
    }
}
