package _12_Arguments;

public class SecondArg {

    public static void main(String[] args) {

        String personalised = myGreet("Shubham Chaudhari");
        System.out.println(personalised);
        
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    
}
