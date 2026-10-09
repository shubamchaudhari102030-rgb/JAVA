package _07_Repetation_of_Digits;

import java.util.Scanner;

public class Q4_Find_Sum_Of_Given_Numbeer {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");

        int a = sc.nextInt();


        int ans =0;

        while(a !=0){

            int rem = a%10;

            ans = ans + rem; 

            a= a/10;

        }

        System.out.println(ans);

    
    }
    
}
