package _14_Change_Value;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        //Create new array
        int[] arr = {1, 3, 2, 45, 8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change (int[] wwwww){
        wwwww[0] =99; //if you make the change to the object via
                    // this ref variable, same object will be changed
    }

    
}
