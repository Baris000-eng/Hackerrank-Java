
// Java program for construction
// of full binary tree
public class fullbinarytreepostpre
{
    // variable to hold index in pre[] array
    static int preindex;
 
    static class node
    {
        int data;
        node left, right;
 
        public node(int data)
        {
            this.data = data;
        }
    }
 
    // A recursive function to construct Full
    // from pre[] and post[]. preIndex is used
    // to keep track of index in pre[]. l is
    // low index and h is high index for the
    // current subarray in post[]
    static node constructTreeUtil(int pre[], int post[], int l,
                                   int h, int size)
    {
         
        // Base case
        if (preindex >= size || l > h)
            return null;
 
        // The first node in preorder traversal is
        // root. So take the node at preIndex from
        // preorder and make it root, and increment
        // preIndex
        node root = new node(pre[preindex]);
        preindex++;
         
        // If the current subarray has only one
        // element, no need to recur or
        // preIndex > size after incrementing
        if (l == h || preindex >= size)
            return root;
        int i;
         
        // Search the next element of pre[] in post[]
        for (i = l; i <= h; i++)
        {
            if (post[i] == pre[preindex])
                break;
        }
        // Use the index of element found in
        // postorder to divide postorder array
        // in two parts. Left subtree and right subtree
        if (i <= h)
        {
            root.left = constructTreeUtil(pre, post, l, i, size);
            root.right = constructTreeUtil(pre, post, i + 1, h-1, size);
        }
        return root;
    }
 
    // The main function to construct Full
    // Binary Tree from given preorder and
    // postorder traversals. This function
    // mainly uses constructTreeUtil()
    static node constructTree(int pre[], int post[], int size)
    {
        preindex = 0;
        return constructTreeUtil(pre, post, 0, size - 1, size);
    }
 
    static void printInorder(node root)
    {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
 
    public static void main(String[] args)
    {
 
        char pre[] = { 'A','B','D','E','C','F','G'};
        char post[] = { 'D','E','F','G','B','C','A'};
 
        int size = pre.length;
        node root = constructTree(pre, post, size);
 
        System.out.println("Inorder traversal of the constructed tree:");
        printInorder(root);
    }
}
 
// This code is contributed by Rishabh Mahrsee