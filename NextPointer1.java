public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        
        // set left first and then right accordingly the logic
        if(root.left != null){
            root.left.next = root.right;
            root.right.next = root.next == null ? null : root.next.left;
        }
        
        connect(root.left);
        connect(root.right);
    }
}
