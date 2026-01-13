import java.util.Scanner;

class Fibonacci {
   public static int fibRec(int n) {
      if (n == 0 || n == 1)
         return n;
      return fibRec(n - 1) + fibRec(n - 2);
   }

   private static int fib(int n, int[] fibArr) {
      if (n == 0 || n == 1)
         return n;

      if (fibArr[n] != -1) {
         return fibArr[n];
      }

      fibArr[n] = fib(n - 1, fibArr) + fib(n - 2, fibArr);
      return fibArr[n];

   }

   public static int fibonacciByDP(int n) {
      // Initalization
      int[] fibArr = new int[n + 1];
      // Assigning the values
      for (int i = 0; i < fibArr.length; i++) {
         if (i == 0 || i == 1) {
            fibArr[i] = i;
         }
         fibArr[i] = -1;
      }

      return fib(n, fibArr);
   }

   public static void main(String[] args) {
      System.out.println("Fibonacci Numbers");
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the n: ");
      int n = scanner.nextInt();

      int nthTerm = fibonacciByDP(n);
      System.out.println("The nTh term of fibonacci series is: " + nthTerm);

      scanner.close();

   }
}