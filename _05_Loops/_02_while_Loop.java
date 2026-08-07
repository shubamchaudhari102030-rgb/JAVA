package _05_Loops;

import java.util.Scanner;

public class _02_while_Loop {

    public static void main(String[] args) {

        // int num = 1;
        // while(num<=10){
        //     System.out.println(num);

        //     num +=1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = input.nextInt();

        int num = 1;
        while(num<=n){
            System.out.println(num);

            num+=1;

            input.close();
        }

        }
        
        

    }
    

