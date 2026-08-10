package _06_Fibonacci;

import java.util.Scanner;

public class Q1_M1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1; i<=n ; i++){
            System.out.print(a + " ");
        
            int next = a+b;
            a = b;
            b = next;
        }

        in.close();


        }
    }
    

