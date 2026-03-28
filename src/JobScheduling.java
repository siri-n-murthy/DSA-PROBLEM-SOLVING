import java.util.Arrays;
public class JobScheduling {
    static class Job {
        int start;
        int end;
        int profit;

        public Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> a.end - b.end);

        int[] dp = new int[n];
        dp[0] = jobs[0].profit;


        for (int i = 1; i < n; i++) {
            int includeProfit = jobs[i].profit;
            dp[i] = Math.max(dp[i - 1], includeProfit);
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j].end <= jobs[i].start) {
                    dp[i] = Math.max(dp[i], dp[j] + includeProfit);
                    break;
                }
            }
        }

        return dp[n - 1];
    }

public static void main(String[] args) {
        int[] startTime = {1, 2, 3, 3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};
        System.out.println("Maximum profit: " + jobScheduling(startTime, endTime, profit));
    }
}