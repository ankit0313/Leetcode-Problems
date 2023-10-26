/**
 * MinimumKnightMoves
 *
 * Problem Statement:
 * Given a chessboard of size N x N, where each cell is initially empty,
 * you are given coordinates (x, y) of a knight and your task is to find
 * the minimum number of moves the knight needs to make to reach the square (0, 0).
 * The knight has the standard chess piece moves. The chessboard is of size
 * |x| + 2 * 301 and |y| + 2 * 301 to handle negative coordinates.
 *
 * Example:
 * Input: x = 2, y = 1
 * Output: 1
 * Explanation: The knight moves from (2, 1) to (0, 0) in 1 move.
 *
 * Note:
 * - |x| and |y| are less than or equal to 300.
 * - The chessboard size is expanded to handle negative coordinates.
 */


import java.util.LinkedList;
import java.util.Queue;

public class MinimumKnightMoves {
    public static int minKnightMoves(int x, int y) {
        // Normalize the coordinates to the first quadrant
        x = Math.abs(x);
        y = Math.abs(y);

        // Possible moves of a knight
        int[][] directions = {{-1, -2}, {-2, -1}, {-2, 1}, {-1, 2},
                               {1, -2}, {2, -1}, {2, 1}, {1, 2}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});  // Starting position
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Process all positions at the current level
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int curX = current[0];
                int curY = current[1];

                if (curX == x && curY == y) {
                    return steps;
                }

                // Explore possible moves from the current position
                for (int[] direction : directions) {
                    int newX = curX + direction[0];
                    int newY = curY + direction[1];

                    // Check if the new position is valid
                    if (newX >= -1 && newY >= -1 && !visited[newX + 301][newY + 301]) {
                        visited[newX + 301][newY + 301] = true;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }

            steps++;
        }

        return -1;  // If no solution is found
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        int result = minKnightMoves(x, y);
        System.out.println("Minimum Knight Moves: " + result);
    }
}
