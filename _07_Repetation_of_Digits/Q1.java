package _07_Repetation_of_Digits;

public class Q1 {

    public static void main(String[] args) {

        int n = 75405955;

        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 5) {
                count++;
            }
            n = n/10;
        }

        System.out.println(count);

        
        
    }
    
}
