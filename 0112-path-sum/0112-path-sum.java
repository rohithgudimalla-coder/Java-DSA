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
    int sum=0;
    boolean ans=false;
    public void helper(TreeNode root,int ts){
        if(root ==null){
            return;
        }
        sum+=root.val;
        if(root.left==null && root.right==null && sum==ts){
            ans=true;
            return;
        }

        helper(root.left,ts);
        helper(root.right,ts);
        sum-=root.val;
    }
    public boolean hasPathSum(TreeNode root, int ts) {

        if(root==null){
            return false;
        }
        helper(root,ts);
        return ans;
    }
}