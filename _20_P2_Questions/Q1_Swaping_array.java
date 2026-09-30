package _20_P2_Questions;

import java.util.Arrays;

public class Q1_Swaping_array {

    public static void main(String[] args)
    {
        int[] arr = {15, 73, 3, 47, 5};
        swap(arr, 1, 4);

        System.out.println(Arrays.toString(arr));        
    } 

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
        


    
}
