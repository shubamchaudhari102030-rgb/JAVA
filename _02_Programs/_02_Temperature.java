package _02_Programs;

import java.util.Scanner;

public class _02_Temperature {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter Temp in C: ");

        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);

         in.close();
    }
    
}
