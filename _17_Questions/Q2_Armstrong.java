package _17_Questions;

import java.util.Scanner;

public class Q2_Armstrong {

    public static void main(String[] jsghdkh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = in.nextInt();

        int original = n;
        int sum = 0;


        while(n>0){
            int rem = n%10;

            sum = sum + (rem*rem*rem);
            n = n/10;

        }

        if (sum == original)
            {
            System.out.println("Armstrong Number");

        }
         else {
            System.out.println("No Armstrong number");
        }

        in.close();  

    }
}
    

