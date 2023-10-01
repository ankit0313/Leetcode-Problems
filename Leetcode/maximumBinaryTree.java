// Problem Link : https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/description/

// Solution to the problem

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int m, int n) {
        if (m > n) {
            return null;
        }
        int k = -1;
        int x = Integer.MIN_VALUE;
        for (int i = m; i <= n; i++) {
            if (nums[i] > x) {
                k = i;
                x = nums[i];
            }
        }
        TreeNode root = new TreeNode(nums[k]);
        root.left = helper(nums, m, k - 1);
        root.right = helper(nums, k + 1, n);
        return root;
    }
}