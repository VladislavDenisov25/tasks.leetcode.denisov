import easy.task94.BinaryTreeInorderTraversal;
import easy.task94.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import easy.task94.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task94Test {

    @ParameterizedTest
    @MethodSource("init")
    public void testTree(TreeNode tree, List<Integer> array){
        BinaryTreeInorderTraversal bin = new BinaryTreeInorderTraversal();
        List<Integer> integers = bin.inorderTraversal(tree);
        assertEquals(array, integers);

    }


    public static Stream<Arguments> init() {
        return Stream.of(Arguments.of(new TreeNode(1,
                (new TreeNode(2, new TreeNode(4),
                        (new TreeNode(5, new TreeNode(6), new TreeNode(7)))
                )),
                new TreeNode(3, null,
                        new TreeNode(8, new TreeNode(9), null))),
                List.of(4,2,6,5,7,1,3,9,8)));
    }
}
