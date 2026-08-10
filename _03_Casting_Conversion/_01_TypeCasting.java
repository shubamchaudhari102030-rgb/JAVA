

//Now When we input an integer then it will be 
//automatically converted into float

//integer to float

package _03_Casting_Conversion;

import java.util.Scanner;

public class _01_TypeCasting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double a = sc.nextDouble();

        int b = (int) a;   // Type Casting

        System.out.println("Integer value: " + b);

        sc.close();
    }
}