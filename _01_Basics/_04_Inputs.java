
package _01_Basics;
import java.util.Scanner;

public class _04_Inputs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input ");


        int rollno = input.nextInt();
        System.out.println("Your Roll number is " + rollno);

        input.close();
        
    }
    
}
