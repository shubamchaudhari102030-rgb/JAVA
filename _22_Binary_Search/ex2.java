
//Array sorted in descending order

package _22_Binary_Search;

public class ex2 {

    public static void main(String[] args) {
        
        int[] arr = { 86 , 42, 31, 27, 23, 16, 11, 7,3,1};
        int target = 31;
        int ans = result(arr, target);
        System.out.println(ans);
    }
    
    static int result(int[] arr , int target ) {

        int start = 0 ;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                end = mid-1;
            }
            else if(target< arr[mid]){
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;


    }
}
