package _02_Programs;

import java.util.Scanner;

public class _03_Find_Quot_Rem {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numerator: ");
        int a = sc.nextInt();

        System.out.println("Enter Denominator");
        int b = sc.nextInt();

        int quotient = a/b;
        int remainder = a%b;

        System.out.println(quotient);
        System.out.println(remainder);



    }
}

        
   
    
    












