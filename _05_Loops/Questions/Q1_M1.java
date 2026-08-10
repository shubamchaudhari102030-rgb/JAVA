
// Find The largest of 3 numbers

package _05_Loops.Questions;

import java.util.Scanner;

public class Q1_M1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(b>max){
            max = b;  // b chi value max la assign zali...
        }
        if(c>max){
            max = c;
        }

        System.out.println(max);

        input.close();


    }
    
}
