package _20_P2_Questions;




public class Q2_Max_Value_Of_Array {

    public static void main(String[] args) 
    {

        int[] arr = {2,56,37,65,753};
        System.out.println(max(arr));
    }

    static int max (int[] arr)
    {

        int maxVal = arr[0];     // We consider the first element as the maximum value and then we will compare it with the rest of the elements in the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
}
