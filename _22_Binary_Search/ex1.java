package _22_Binary_Search;

public class ex1 {

    public static void main(String[] args) {

        int[] arr = {-9 , -3, 0 , 4, 7, 12 , 36, 42, 45,97};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr , int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }

            else if (target < arr[mid]) {
                end = mid -1;
            
            }

            else {
                return mid; // return ans
            }
        }

        return -1;
    }
    
}
