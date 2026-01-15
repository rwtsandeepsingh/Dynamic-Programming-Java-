public class Recusion {

   public static int countWays(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }

      return countWays(n - 1) + countWays(n - 2);
   }

   public static void main(String[] args) {
      System.out.println("Count ways Recursion");
      int n = 4;
      int ans = countWays(n);
      System.out.println(ans);
   }
}
