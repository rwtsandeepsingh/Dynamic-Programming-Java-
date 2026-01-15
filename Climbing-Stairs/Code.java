import java.util.Arrays;

public class Code {

   private static int countWaysMemoUtil(int n, int memo[]) {
      if (n == 0 || n == 1)
         return 1;

      if (memo[n] != -1)
         return memo[n];

      memo[n] = countWaysMemoUtil(n - 1, memo) + countWaysMemoUtil(n - 2, memo);
      return memo[n];
   }

   public static int countWaysMemo(int n) {
      int memo[] = new int[n + 1];
      Arrays.fill(memo, -1);
      return countWaysMemoUtil(n, memo);
   }

   public static void main(String[] args) {
      System.out.println("Climbing Stairs");
      int n = 5;
      int ans = countWaysMemo(n);
      System.out.println(ans);
   }
}
