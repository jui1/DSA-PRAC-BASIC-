// You can change the package name or remove it

public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; 

        Solution sol = new Solution();
        int maxProfit = sol.maxProfit(prices);

        System.out.println("Maximum Profit: " + maxProfit);
    }
}

class Solution {
    public int maxProfit(int[] p) {
        if (p == null || p.length == 0) return 0;

        int max = 0;         
        int min = p[0];      

        for (int i = 1; i < p.length; i++) {
            int profitToday = p[i] - min;       
            max = Math.max(max, profitToday);   
            min = Math.min(min, p[i]);         
        }

        return max;
    }
}
