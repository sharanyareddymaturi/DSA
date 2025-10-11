// User function Template for Java

class Solution {
    public static void flatten(Node root) {
        move(root);
    }
    public static Node move(Node root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        Node leftTrail=move(root.left);
        Node rightTrail=move(root.right);

        if(leftTrail!=null){
            leftTrail.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        return rightTrail!=null?rightTrail:leftTrail; 
        
    }
}