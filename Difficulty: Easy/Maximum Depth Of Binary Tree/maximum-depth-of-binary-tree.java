// User function Template for Java

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int a=maxDepth(root.left);
        int b=maxDepth(root.right);
        return 1+Math.max(a,b);
        
    }
}
