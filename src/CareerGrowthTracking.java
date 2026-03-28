import java.util.Arrays;
public class CareerGrowthTracking {
    public static int longestIncreasingStreak(int[] salaries) {
        if (salaries == null || salaries.length == 0) {
            return 0;
        }

        int n = salaries.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxStreak = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (salaries[j] < salaries[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxStreak = Math.max(maxStreak, dp[i]);
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        int[] performance = {2, 3, 1, 2, 3, 4, 1};
        System.out.println("Longest increasing streak: " + longestIncreasingStreak(performance));
    }
}