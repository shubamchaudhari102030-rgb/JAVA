package _20_P2_Questions;

public class Q2_P2_maxValue_In_Range {

    public static void main(String[] args) 
    {
        int[] arr = {2,56,37,65,753};
        System.out.println(maxRange(arr, 1, 3));  // It shows max value from index 1 & 3
    }

    static int maxRange (int[] arr, int start, int end)
    {

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}
