package _21_Linear_Search;

public class _03_Search_In_Range {
    public static void main(String[] args) {

        

        int[] arr = {18, 12, -7, 3, 14, 28};

        int target = 14;
        int start = 1;
        int end = 4;

        for (int i = start; i <= end; i++) {

            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
        }
    }
}
        
    
