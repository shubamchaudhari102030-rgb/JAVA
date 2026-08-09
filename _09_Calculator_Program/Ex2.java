


// हे बघ, इथे आपण while loop नाही लावला, कारण आपल्याला पुन्हा पुन्हा input नको आहे—जसं की “Enter two numbers” पुन्हा पुन्हा येऊ नये.

//आणि while loop नाही लावल्यामुळे break सुद्धा काम करणार नाही, म्हणून आपण break पण remove करून टाकला.

//आपल्याला फक्त एकदाच input घ्यायचा आहे, म्हणून आपण while loop remove केला.



package _09_Calculator_Program;

import java.util.Scanner;

public class Ex2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Take input from user till user doesnot print X or x
        int ans = 0;
            //Take opeator as input
            


            System.out.print("Ener tow numbers: ");
            System.out.println();
            //input two numbers
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            System.out.println();

            System.out.print("Enter the operator: ");

        char op = in.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){
           

            System.out.println();
            

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
            }
            else{
                System.out.println("Invalid operator");
            }

            System.out.print("Final Answer is: ");

          System.out.println(ans);

          in.close();
            
            
            
        }
    
}
