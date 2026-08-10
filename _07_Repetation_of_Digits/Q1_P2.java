package _07_Repetation_of_Digits;

import java.util.Scanner;

public class Q1_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = sc.nextInt();

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==2){
                count++;
            }
            n = n/10;
        }
        System.out.print("The Count is: ");
        System.out.println(count);

        sc.close();
    }

    

    
}
