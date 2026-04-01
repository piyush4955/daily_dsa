/**
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // time: O(n), n = number of nodes in the queue to loop through
        // space:O(n), n = number of elements store in the List

        // root   = 3 9 20 null null 15 7
        // output = [3] [9,20] [15,7]

        if(root == null) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> levelOrder = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                levelOrder.add(node.val);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right); 
            }

            list.add(levelOrder);
        }
        return list;
    }
}