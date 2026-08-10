package _04_Conditional_Statements;

import java.util.Scanner;

public class _01_Pt2_if_else {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");

        int marks = sc.nextInt();

        System.out.print("You Got ");

        if(marks >=0 && marks <30){
            System.out.println("Fail");
        }

        else if(marks>=30 && marks < 50){
            System.out.println("Good marks ");
        }
        else if(marks >=50 && marks < 80){
            System.out.println("Better marks ");
        }
        else if(marks>=80 && marks <=100){
            System.out.println("Excellent marks");
        }
        else{
            System.out.println("Invalid marks");
        }

        sc.close();


    }



}