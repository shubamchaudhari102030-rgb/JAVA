

//Now When we input an integer then it will be 
//automatically converted into float

//integer to float

package _03_Casting_Conversion;

import java.util.Scanner;

public class _01_TypeCasting {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Input an integer");

    float num = input.nextFloat();
    System.out.println(num);   
    
     input.close();
    }
    
}
