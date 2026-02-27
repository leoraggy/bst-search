import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    void testEmptyBinaryTree(){
        BinaryTreeNode<Integer> tree = null;

        assertFalse(BstSearch.contains(tree, 10));
    }

    @Test
    void testNullTarget(){
        BinaryTreeNode<Integer> tree = null;

         NullPointerException exception = assertThrows(
            NullPointerException.class,
            () -> BstSearch.contains(tree, null)
            );

        assertEquals("Target cannot be null", exception.getMessage());
    }

    @Test
    void testSingleTreeRootIsTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        assertTrue(BstSearch.contains(root, 50));
    }

    @Test
    void testSingleTreeNotarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        assertFalse(BstSearch.contains(root, 1000));
    }

    @Test
    void testContainsTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(30);
        root.right = new BinaryTreeNode<>(70);

        root.left.left = new BinaryTreeNode<>(20);
        root.left.right = new BinaryTreeNode<>(40);

        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(80);

        root.left.left.left = new BinaryTreeNode<>(10);

        root.left.right.left = new BinaryTreeNode<>(35);

        root.right.left.right = new BinaryTreeNode<>(65);

        assertTrue(BstSearch.contains(root, 10));
    }

    @Test
    void testDoesNotContainTarget(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(30);
        root.right = new BinaryTreeNode<>(70);

        root.left.left = new BinaryTreeNode<>(20);
        root.left.right = new BinaryTreeNode<>(40);

        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(80);

        root.left.left.left = new BinaryTreeNode<>(10);

        root.left.right.left = new BinaryTreeNode<>(35);

        root.right.left.right = new BinaryTreeNode<>(65);

        assertFalse(BstSearch.contains(root, 1000));
    }

    // Iterative tests
    @Test
    void testEmptyBinaryTreeIter(){
        BinaryTreeNode<Integer> tree = null;

        assertFalse(BstSearch.containsIteratively(tree, 10));
    }

    @Test
    void testNullTargetIter(){
        BinaryTreeNode<Integer> tree = null;

         NullPointerException exception = assertThrows(
            NullPointerException.class,
            () -> BstSearch.containsIteratively(tree, null)
    );

        assertEquals("Target cannot be null", exception.getMessage());
    }

    @Test
    void testSingleTreeRootIsTargetIter(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        assertTrue(BstSearch.containsIteratively(root, 50));
    }

    @Test
    void testSingleTreeNotargetIter(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        assertFalse(BstSearch.containsIteratively(root, 1000));
    }

    @Test
    void testContainsTargetIter(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(30);
        root.right = new BinaryTreeNode<>(70);

        root.left.left = new BinaryTreeNode<>(20);
        root.left.right = new BinaryTreeNode<>(40);

        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(80);

        root.left.left.left = new BinaryTreeNode<>(10);

        root.left.right.left = new BinaryTreeNode<>(35);

        root.right.left.right = new BinaryTreeNode<>(65);

        assertTrue(BstSearch.containsIteratively(root, 10));
    }

    @Test
    void testDoesNotContainTargetIter(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(50);

        root.left = new BinaryTreeNode<>(30);
        root.right = new BinaryTreeNode<>(70);

        root.left.left = new BinaryTreeNode<>(20);
        root.left.right = new BinaryTreeNode<>(40);

        root.right.left = new BinaryTreeNode<>(60);
        root.right.right = new BinaryTreeNode<>(80);

        root.left.left.left = new BinaryTreeNode<>(10);

        root.left.right.left = new BinaryTreeNode<>(35);

        root.right.left.right = new BinaryTreeNode<>(65);

        assertFalse(BstSearch.containsIteratively(root, 1000));
    }

}
