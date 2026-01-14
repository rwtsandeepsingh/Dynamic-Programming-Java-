import java.util.Arrays;

public class Code {
   private static int rodCuttingMemo(int[] price, int n, int memo[]) {
      if (n == 0)
         return 0;

      if (memo[n - 1] != -1)
         return memo[n - 1];

      int ans = 0;
      for (int j = 1; j <= n; j++) {
         ans = Math.max(ans, price[j - 1] + rodCuttingMemo(price, n - j, memo));
      }

      return memo[n - 1] = ans;
   }

   public static int rodCutting(int[] price) {
      int n = price.length;
      int memo[] = new int[n];
      Arrays.fill(memo, -1);

      return rodCuttingMemo(price, n, memo);
   }

   public static void main(String[] args) {
      System.out.println("Rod Cutting by Memoization and Tabulation");
      int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
      int ans = rodCutting(price);
      System.out.println(ans);
   }
}
