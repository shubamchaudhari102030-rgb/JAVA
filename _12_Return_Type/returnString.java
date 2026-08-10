package _12_Return_Type;

public class returnString {

    public static void main(String[] args) {

        String message = greet();
        System.out.println(message);
        
    }

    static String greet(){
        String greeting = "How Are You";
        return greeting;

    }
    
}
