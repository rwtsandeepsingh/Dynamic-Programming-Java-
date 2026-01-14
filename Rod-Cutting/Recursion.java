
public class Recursion {

   private static int rodCuttingRec(int i, int[] price) {
      if (i == 0)
         return 0;

      int maxProfit = -1;
      for (int j = 1; j <= i; j++) {
         int currProfit = price[j - 1] + rodCuttingRec(i - j, price);
         maxProfit = Math.max(maxProfit, currProfit);
      }

      return maxProfit;
   }

   public static int rodCutting(int[] price) {
      int n = price.length;
      return rodCuttingRec(n, price);
   }

   public static void main(String[] args) {
      int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
      int ans = rodCutting(price);
      System.out.println(ans);
   }
}
