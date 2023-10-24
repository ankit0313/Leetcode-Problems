/* Leetcode link- https://leetcode.com/problems/binary-tree-right-side-view/ */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left), height(root.right));
    }
    public static void preOrder(TreeNode root, ArrayList<Integer> ans, int level){
        if(root==null) return;
        ans.set(level-1, root.val);
        preOrder(root.left, ans, level+1);
        preOrder(root.right, ans, level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<height(root);i++){
            ans.add(0);
        }
        preOrder(root, ans, 1);
        return ans;
    }
}
