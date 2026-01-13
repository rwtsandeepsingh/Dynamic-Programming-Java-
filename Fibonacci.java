import java.util.Scanner;

class Fibonacci {
   public static int fibRec(int n) {
      if (n == 0 || n == 1)
         return n;
      return fibRec(n - 1) + fibRec(n - 2);
   }

   public static void main(String[] args) {
      System.out.println("Fibonacci Numbers");
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the n: ");
      int n = scanner.nextInt();

      int nthTerm = fibRec(n);
      System.out.println("The nTh term of fibonacci series is: " + nthTerm);

      scanner.close();

   }
}