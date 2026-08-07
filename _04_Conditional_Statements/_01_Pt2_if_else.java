package _04_Conditional_Statements;

import java.util.Scanner;

public class _01_Pt2_if_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks:");

        int marks = input.nextInt();

        if(marks<=30){
            System.out.println("Fail");
        }

        else if(marks>30 && marks<=70){
            System.out.println("Very Good");

        }

        else if(marks>70 && marks<=100){
            System.out.println("Excellent");
        }

        else{
            System.out.println("Invalid Marks");
        }

        System.out.println(marks);

        input.close();

        
    }


}