package _16_Method_Overloading;

public class examples {

    public static void main(String[] args) {

        fun(78);
        fun("Shubham");
        

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    
    
}
