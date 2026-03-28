public class BudgetShopping {
    public static int maxsatisfaction(int[] prices,int[] scores, int budget) {
        int n=prices.length;
        int[][]dp=new int[n+1][budget+1];
        for(int i=1;i<=n;i++){
            for(int j=0;j<=budget;j++){
                if(prices[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-prices[i-1]]+scores[i-1]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][budget];
    }

    public static void main(String[] args) {
        int[] prices = {10, 20, 30};
        int[] scores = {60, 100, 120};
        int budget = 50;
        int maxSatisfaction = maxsatisfaction(prices, scores, budget);
        System.out.println("Maximum Satisfaction: " + maxSatisfaction);
    }
}