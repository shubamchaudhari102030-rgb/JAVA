package _05_Loops.Questions;

import java.util.Scanner;

public class Q1_M3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c , Math.max(a, b));
            
             //Math.max(a, b) gives the maximum value between and b  .. let = k
            //Math.max(c , Math.max(a, b)) gives the maximum value between c and k 
        System.out.println(max);

        input.close();
    }
    
}
