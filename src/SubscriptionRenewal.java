//Input: An integer array days (sorted in non-decreasing order) and an integer K. 
//Output: Length of the longest valid window.
public class SubscriptionRenewal {
    public static int longestValidWindow(int[] days, int K) {
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < days.length; end++) {
            while (days[end] - days[start] > K) {
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] days = {1,3,5,7,9};
        int K = 4;
        System.out.println(longestValidWindow(days, K)); // Output: 3
    }
}
