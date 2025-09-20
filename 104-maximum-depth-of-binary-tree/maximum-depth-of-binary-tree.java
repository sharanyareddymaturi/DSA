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

// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.add(root);
//         int depth=0;

//         while(!queue.isEmpty()){
//             int size=queue.size();
//             for(int i=0;i<size;i++){
//                 TreeNode node=queue.poll();//poll==delete

//                 if(node.left==null && node.right==null){
//                     continue;
//                 }
//                 if(node.left!=null){
//                     queue.add(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.add(node.right);
//                 }
//             }
//             depth++;
//         }
//         return depth;
//     }
// }

class Solution {
    public int maxDepth(TreeNode root) {
        return Helper(root,0);
    }
    public int Helper(TreeNode root,int curr){
        if(root==null){
            return curr;
        }
        int a=Helper(root.left,curr+1);
        int b=Helper(root.right,curr+1);

        return Math.max(a,b);
    }
}
