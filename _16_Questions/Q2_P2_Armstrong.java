package _16_Questions;

public class Q2_P2_Armstrong {

    public static void main(String[] args) {
        
        for(int i = 100 ; i<1000 ; i++){

            int n =i;
            int sum = 0;

            while (n >0){

                int rem = n%10;
                sum = sum + (rem*rem*rem);

                n = n/10;    
            }

            

            if (sum== i ){

               
                System.out.println(i);
            }
        }
    }
    
}
