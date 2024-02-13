public class Practical5 {
    public static void main(String[] args) {
        
        int n =3; //input number
        int count = 0;
        int num = 2; // Start checking from 2
        while (count < n) {
            int factorCount = 0; // Count of factors of num
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factorCount++;
                }
               // if (factorCount > 2) {
               //     break; // If more than 2 factors, not prime
              //  }
            }
            if (factorCount == 2) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
