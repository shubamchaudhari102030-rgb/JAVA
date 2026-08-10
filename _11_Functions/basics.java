package _11_Functions;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args)
     {
    
        for(int i =1 ; i<=3; i++){
            //function call
            sum();
        }

        //OR

        // sum();
        // sum();
        // sum();
    }
    
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is =" + sum);

        in.close();
    }
}
