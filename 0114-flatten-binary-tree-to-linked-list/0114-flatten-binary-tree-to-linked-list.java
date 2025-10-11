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
    public void flatten(TreeNode root) {
        move(root);
    }
    public TreeNode move(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        TreeNode leftTrail=move(root.left);
        TreeNode rightTrail=move(root.right);

        if(leftTrail!=null){
            leftTrail.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return rightTrail!=null?rightTrail:leftTrail;
    }
}