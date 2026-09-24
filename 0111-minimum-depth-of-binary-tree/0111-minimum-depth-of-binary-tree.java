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
    static int min=Integer.MAX_VALUE;
    public void dfs(TreeNode root,int level){
        if(root==null){
            return;

        }
        if(root.left==null && root.right==null){
            min=Math.min(min,level);
            return;
        }
        if(root.left!=null){
            dfs(root.left,level+1);

        }
        if(root.right!=null){
            dfs(root.right,level+1);
        }
    }
    
    public int minDepth(TreeNode root) {
       if(root==null){
        return 0;
       }
       
        min=Integer.MAX_VALUE;
        dfs(root,1);
        return min;
    }
}