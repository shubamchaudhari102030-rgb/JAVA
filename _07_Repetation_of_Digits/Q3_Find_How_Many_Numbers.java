package _07_Repetation_of_Digits;

import java.util.Scanner;

public class Q3_Find_How_Many_Numbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");

        int a = sc.nextInt();

        int count = 0;

        while(a !=0){
            a = a/10;

            count ++;
        }

        System.out.println(count);

    }
    
}
