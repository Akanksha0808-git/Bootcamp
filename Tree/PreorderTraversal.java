package Tree;
import java.util.*;
class TreeNode{
int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; 

     }

     
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
    }
 
class Solution {
        List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
        }
        private void preorder(TreeNode root){
        if (root==null){
            return;
        }
        
        result.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        System.out.println(sol.preorderTraversal(root));
    }
}
