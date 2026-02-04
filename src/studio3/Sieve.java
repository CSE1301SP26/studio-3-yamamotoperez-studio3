
import java.util.Scanner;
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");
        int number = in.nextInt();
        int [] list = new int[number++];
        int [] divisors = new int[50];
        
         boolean[] isPrime = new boolean[number + 1];

         for (int i = 2; i <= number; i++) {
             isPrime[i] = true;
         }
         for (int p = 2; p * p <= number; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= number; multiple += p) {
                    isPrime[multiple] = false;

                     System.out.println("Prime numbers up to " + number + ":");
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
        }
    }
}
}
}
    }
}




        

        
        
        

        








    



