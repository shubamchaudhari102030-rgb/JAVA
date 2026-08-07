package _05_Loops;

import java.util.Scanner;

public class _03_do_while_Loop {

    public static void main(String[] args) {
        
        // int n = 1;
        // do{
        //     System.out.println(n);
        //     n++;
        // }
        // while(n<=10);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = input.nextInt();


        int num = 1;

        do{
            System.out.println(num);
            num++;
        } 
        while(num<=n);
        
        input.close();
    }
    
}
