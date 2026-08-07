
package _01_Basics;
import java.util.Scanner;

 class _02_SecondClass {

    public static void main(String[] args) {

        System.out.println("Hello, How are you?");
        
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt()); //This is for integer
        System.out.println(input.next()); //This is for Character (Only 1st word print)
        System.out.println(input.nextLine()); //Print entire line
    
        input.close();
    }
    
}
