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
    public int preorder(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=preorder(root.left);
        int right=preorder(root.right);
        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        return preorder(root);
    }
}