// You can change the package name or remove it

public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // sample input

        Solution sol = new Solution();
        int maxProfit = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] p) {
        if (p == null || p.length == 0) return 0;

        int max = 0;         // maximum profit so far
        int min = p[0];      // minimum buy price so far

        for (int i = 1; i < p.length; i++) {
            int profitToday = p[i] - min;       // profit if sell today
            max = Math.max(max, profitToday);   // update max profit
            min = Math.min(min, p[i]);          // update min buy price
        }

        return max;
    }
}
