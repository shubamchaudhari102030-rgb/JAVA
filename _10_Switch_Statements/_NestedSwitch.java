package _10_Switch_Statements;

import java.util.Scanner;

public class _NestedSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Shubham Chaudhari");
                break;

            case 2: 
                System.out.println("Shubhangi Chaudhari");
                break;

            case 3:
                System.out.println("Emp no. 3");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("management department");
                        break;
                        default:
                            System.out.println("No Department entered");


                }
                break;
                default: 
                System.out.println("Enter Correct Department");

                in.close();
    
        }


    }
    
}
