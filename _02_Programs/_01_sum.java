package _02_Programs;

import java.util.Scanner;

public class _01_sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is :" + sum);

        input.close();

        
    }
    
}
