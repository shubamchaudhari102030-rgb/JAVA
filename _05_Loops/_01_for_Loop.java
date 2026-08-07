package _05_Loops;

import java.util.Scanner;

public class _01_for_Loop {

    public static void main(String[] args) {

        // for(int i =1 ; i<=10 ; i++){

        // System.out.println(i);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = in.nextInt();

        for(int num = 1 ; num<=n ; num++) {
            System.out.print(num + " ");
        }


        in.close();

    }
        
    }

    
    

