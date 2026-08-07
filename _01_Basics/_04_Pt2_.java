
package _01_Basics;
import java.util.Scanner;

public class _04_Pt2_ {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name here..");

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        input.close();
    }
    
}
