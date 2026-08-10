package _04_Conditional_Statements;

import java.util.Scanner;

public class _01_if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary:");

        int salary = sc.nextInt();

        System.out.println("New salary is:" );

        if(salary>=20000  && salary < 50000){
            
            salary = salary + 2000;
        }

        else if (salary >=50000){
           
            salary = salary + 5000;
        }

        else if (salary <20000){
            salary =   salary + 5;
        }

        System.out.println(salary);

        sc.close();

    }
    
    
}
