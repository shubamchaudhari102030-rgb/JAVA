package _08_Reverse_The_Number;

import java.util.Scanner;

public class Q1_P2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer the value of n: ");
        int n = sc.nextInt();

        int ans = 0;
        while(n>0){

            int rem = n%10;

            n = n/10;
            
            ans = ans*10 + rem;
        }
        System.out.print("The reverse of  is: ");
        System.out.println(ans);

        sc.close();

    }
    
}
