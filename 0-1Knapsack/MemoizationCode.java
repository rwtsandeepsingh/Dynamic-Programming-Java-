import java.util.Arrays;

class MemoizationCode {
   private static int KnapsackUtil(int[] price, int[] weight, int cap, int n, int[][] memo) {
      if (n == 0 || cap == 0)
         return 0;

      if (memo[cap][n] != -1)
         return memo[cap][n];

      int profit1 = 0;
      if (weight[n - 1] <= cap) {
         profit1 = price[n - 1] + KnapsackUtil(price, weight, cap - weight[n - 1], n - 1, memo);
      }
      int profit2 = KnapsackUtil(price, weight, cap, n - 1, memo);

      return memo[cap][n] = Math.max(profit1, profit2);
   }

   public static int Knapsack(int[] price, int[] weight, int cap) {
      int n = price.length;

      // initailization of memo
      int memo[][] = new int[cap + 1][n + 1];
      for (int[] arr : memo) {
         Arrays.fill(arr, -1);
      }

      // delaring meaning of memo[i][j]
      // memo[i][j] = max profit when capacity is i and n items \

      KnapsackUtil(price, weight, cap, n, memo);
      for (int i = 0; i < memo.length; i++) {
         for (int j = 0; j < memo[0].length; j++) {
            System.out.print(memo[i][j] + " ");
         }
         System.out.println();
      }
      return memo[cap][n];
   }

   public static void main(String[] args) {
      System.out.println("0-1 Knapsack");
      int W = 4;
      int price[] = { 1, 2, 3 };
      int weight[] = { 4, 5, 1 };

      int maxProfit = Knapsack(price, weight, W);
      System.out.println(maxProfit);
   }
}