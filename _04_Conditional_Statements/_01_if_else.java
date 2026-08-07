package _04_Conditional_Statements;

import java.util.Scanner;

public class _01_if_else {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Salary:");

       int salary = input.nextInt();

       System.out.println("Value of new salary is :");

        if(salary>=20000){
            salary = salary + 2000;
        
        }
        else{
            
            salary = salary + 1000; 
        }

        System.out.println(salary);

        input.close();
    }
    
}
