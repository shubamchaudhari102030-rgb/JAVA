package _03_Casting_Conversion;

import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        float b = a;   // Type Conversion

        System.out.println("Float value: " + b);

        sc.close();
    }
}


