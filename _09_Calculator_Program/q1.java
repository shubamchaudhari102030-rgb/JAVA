package _09_Calculator_Program;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user doesnot print X or x
        int ans = 0;
        while(true) {
            //Take opeator as input
            System.out.print("Enter the operator: ");

        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
           

            System.out.println();
            System.out.print("Ener tow numbers");
            System.out.println();
            //input two numbers
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (op == '+'){
                ans = num1 + num2;
            }
            if (op == '-'){
                ans = num1 - num2;
            }
            if (op == '*'){
                ans = num1 * num2;
            }
            if (op == '/'){
                if(num2 !=0){
                    ans = num1 / num2;
                }
                else{
                   System.out.println("Not Defined");
                }
                
            }
            if (op == '%'){
                ans = num1 % num2;
            }
        }
            else if(op == 'X' || op =='x'){
                break;
            }
            else{
                System.out.println("Invalid operator");
            }

          System.out.println(ans);
            }
            
            in.close();
        }
          
    

    
    }
    
