

/*
Problem  Name  : minimum-path-sum
Problem  Link  : https://leetcode.com/problems/minimum-path-sum/description/

*/

class Solution {
    public int minPathSum(int[][] grid) {
        // Get the number of rows and columns in the grid
        int m = grid.length;
        int n = grid[0].length;
        
        // Create a memoization array to store computed minimum path sums
        int[][] memo = new int[m][n];
        
        // Start the recursion from the bottom-right cell and return the result
        return findMinPathSum(grid, m - 1, n - 1, memo);
    }
    
    // Helper function to compute the minimum path sum from (x, y) to (0, 0)
    private int findMinPathSum(int[][] grid, int x, int y, int[][] memo) {
        // Base case: if we're at the top-left cell (0, 0), return its value
        if (x == 0 && y == 0) {
            return grid[0][0];
        }
        
        // If the minimum path sum from this cell has already been computed, return it
        if (memo[x][y] != 0) {
            return memo[x][y];
        }
        
        // Calculate the minimum path sum by considering two possible moves:
        // 1. Move left (if x > 0)
        // 2. Move up (if y > 0)
        int leftSum = (x > 0) ? findMinPathSum(grid, x - 1, y, memo) : Integer.MAX_VALUE;
        int upSum = (y > 0) ? findMinPathSum(grid, x, y - 1, memo) : Integer.MAX_VALUE;
        
        // Update the memoization array with the minimum path sum for this cell
        memo[x][y] = Math.min(leftSum, upSum) + grid[x][y];
        
        // Return the computed minimum path sum for this cell
        return memo[x][y];
    }
}
