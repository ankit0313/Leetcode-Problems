//Problem Link : https://leetcode.com/problems/unique-paths/


class Solution {
    // Helper function to calculate the number of unique paths
    // from the top-left corner to the bottom-right corner of
    // an m x n grid.
    public int solve(int m, int n, int[][] dp) {
        // Base case: If we are at the destination (bottom-right corner),
        // there is only one way to reach it.
        if (m == 1 && n == 1) {
            return 1;
        }
        // Base case: If we reach the boundary of the grid, there is
        // no way to proceed, so return 0.
        if (m == 0 || n == 0) {
            return 0;
        }

        // If the result for this cell has already been computed,
        // return it to avoid redundant calculations.
        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        // Calculate the number of unique paths by summing the number
        // of paths from the cell above and the cell to the left.
        int up = solve(m - 1, n, dp);
        int left = solve(m, n - 1, dp);

        // Store the result in the dp array to avoid recomputation
        // and return the result.
        dp[m][n] = up + left;
        return dp[m][n];
    }

    // Main function to find the number of unique paths in an m x n grid.
    public int uniquePaths(int m, int n) {
        // Initialize a memoization (dp) array to store computed results.
        int[][] dp = new int[m + 1][n + 1];
        // Fill the dp array with -1 to indicate that results have not been
        // computed yet.
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Call the solve function to calculate the number of unique paths
        // and return the result.
        return solve(m, n, dp);
    }
}
