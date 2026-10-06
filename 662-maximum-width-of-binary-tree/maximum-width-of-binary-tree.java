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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int mxwidth=0;
        Queue<TreeNode> nodes=new LinkedList<>();
        Queue<Integer> indices=new LinkedList<>();
        nodes.offer(root);
        indices.offer(0);
        while(!nodes.isEmpty()){
            int s=nodes.size();
            int f=indices.peek();
            int l=f;
            for(int i=0;i<s;i++){
                TreeNode node=nodes.poll();
                int idx=indices.poll()-f;
                l=idx;
                if(node.left!=null){
                    nodes.offer(node.left);
                    indices.offer(2*idx);
                }
                if(node.right!=null){
                    nodes.offer(node.right);
                    indices.offer(2*idx+1);
                }
            }
            mxwidth=Math.max(mxwidth,l+1);
        }
        return mxwidth;
    }
}