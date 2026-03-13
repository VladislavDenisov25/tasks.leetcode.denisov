package easy.task94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    Stack<TreeNode> stack = new Stack<>();
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return result;
        stack.push(root);
        while (!stack.empty()) {
            if (root.left != null) {
                inorderTraversal(root.left);
            } else {
                result.add(stack.peek().val);
                inorderTraversal(stack.pop().right);
            }
        }
        return result;
    }

}
