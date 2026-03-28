// jumping game using optimal solution
public class JumpingGame2 {
    // Optimal solution for Jump Game II
    public static int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {2, 3, 1, 5, 4},
            {2, 3, 0, 1, 4},
            {1, 1, 1, 1}
        };
        for (int i = 0; i < testCases.length; i++) {
            int result = jump(testCases[i]);
            System.out.println((i + 1) + ": " + result);
        }
    }
}

