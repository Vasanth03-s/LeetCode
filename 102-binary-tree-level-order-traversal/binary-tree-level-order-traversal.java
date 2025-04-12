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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> res=new LinkedList<>();
        res.offer(root);
        while(!res.isEmpty())
        {
            int size=res.size();
            List<Integer> w=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode cur=res.poll();
                w.add(cur.val);
                if(cur.left!=null)
                {
                    res.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    res.offer(cur.right);
                }
            }
            ans.add(w);

        }
        return ans;
    }
}