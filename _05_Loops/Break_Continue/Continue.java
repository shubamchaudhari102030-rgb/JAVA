package _05_Loops.Break_Continue;

public class Continue {

    public static void main(String[] args) {
        

        for (int i = 1; i <= 10; i++) {

    if (i == 3) {
        continue;  // Skips 3
    }

    System.out.println(i);
}
    }
    
}
