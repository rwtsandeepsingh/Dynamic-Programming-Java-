
public class RecursionSol {

   private static int KnapsackUtil(int[] price, int[] weight, int cap, int n) {
      // Base Case
      if (n == 0 || cap == 0)
         return 0;

      // case1 include the item
      int maxProfit1 = 0;

      if (weight[n - 1] <= cap) {
         maxProfit1 = price[n - 1] + KnapsackUtil(price, weight, cap - weight[n - 1], n - 1);
      }

      // case2: not include the item;
      int maxProfit2 = KnapsackUtil(price, weight, cap, n - 1);
      return Math.max(maxProfit1, maxProfit2);
   }

   public static int Knapsack(int[] price, int[] weight, int cap) {
      int n = price.length;
      return KnapsackUtil(price, weight, cap, n);
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
