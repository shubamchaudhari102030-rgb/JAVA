package _08_Reverse_The_Number;

public class Q1 {

    public static void main(String[] args) {
        
        int n = 83653;

        int ans = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;

            ans = ans*10 + rem;

        }
        System.out.println(ans);


    }
    
}
