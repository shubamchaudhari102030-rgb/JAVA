package _05_Loops.Questions;

import java.util.Scanner;

public class Q1_M2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = 0;
        if(a>b){
            max = a;
        }
        else{
            max = b;
        }

        if(c>max){
            max = c;
        }
        System.out.println(max);

        input.close();
    }
    
}
