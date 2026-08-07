package _10_Switch_Statements;

import java.util.Scanner;

public class _Case1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of fruit");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King Of Fruit");
                
                break;

            case "Apple":
                System.out.println("A Sweet Red Fruit");
            
            case "Orange" :
                System.out.println("Round Fruit");
                break;

            default:
                System.out.println("Please enter The valid Fruit");
        }

        in.close();
    }
    
}
