package _07_Repetation_of_Digits;

public class Q1_P1 {

    public static void main(String[] args) {

        int n = 754597655;

        int count = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 7) {
                count++;
            }
            n = n/10;
        }

        System.out.println(count);

        
        
    }
    
}
