public class TabulationSol {

   public static int Knapsack(int[] price, int[] weight, int cap) {
      int n = price.length;
      int[][] tab = new int[cap + 1][n + 1];

      // initailization
      /*
       * for(int i =0; i<tab.length; i++){
       * for(int j=0; j<tab[0].length; j++){
       * if(i == 0 && j ==0){
       * tab[i][j] = 0;
       * }
       * }
       * }
       */
      for (int i = 1; i < tab.length; i++) {
         for (int j = 1; j < tab[0].length; j++) {
            // include
            int profit1 = 0;
            if (weight[j - 1] <= i) {
               profit1 = price[j - 1] + tab[i - weight[j - 1]][j - 1];
            }
            int profit2 = tab[i][j - 1];

            tab[i][j] = Math.max(profit1, profit2);
         }
      }

      for (int i = 0; i < tab.length; i++) {
         for (int j = 0; j < tab[0].length; j++) {
            System.out.print(tab[i][j] + " ");
         }
         System.out.println();
      }
      return tab[cap][n];
   }

   public static void main(String[] args) {
      System.out.println("0-1 knapSack by tabulation");
      int W = 4;
      int price[] = { 1, 2, 3 };
      int weight[] = { 4, 1, 1 };

      int maxProfit = Knapsack(price, weight, W);
      System.out.println(maxProfit);
   }
}
