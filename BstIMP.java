
/**
 * Class Implementation of the BST structure
 * 
 *  @author johnmadaj
 *  @version 20210414
 */
public class BstIMP implements BstADT {
        private Node root;
        
        
        
    /**
     * Def. constructor creates a null root node
     */
    public BstIMP() {
        root = null;
    }
    /**
     * Node constructor takes a node as root, which points to the tree
     * @param h node to become root
     */
    public BstIMP(Node h) {
        root = h;
    }
    

    @Override
    public boolean equals(Object o) {
        return equalTo(o);
    }

    /**
     * Determines if this BstADT is equal to o. The following conditions all 
     * must hold for this equality to be true:
           - o can't be null
            -o must refer to an object that is of type BstADT or its subtypes
           - corresponding Nodes of this BstADT must be equal to the corresponding
            Nodes of the object referred to by o.
     * @param o - reference to the Object against which this BstADT is compared
     * @return true if trees are equal
     */
    @Override
    public boolean equalTo(Object o) {
        if (o == null || !(o instanceof BstADT)) {
            return false;
        }
        
        return equalHelper(root, ((BstIMP)o).root);
    }
    
    /**
     * Helper method required for recursive traversal of node structure
     * @param rt Root of self
     * @param o Root of Object o
     * @return equals
     */
    public boolean equalHelper(Node rt, Node o) {
        if (rt == null || o == null) {
            if (rt != null || o != null) {
                return false;
            }
            return true;
        }
        if (rt.getVal() != o.getVal()) {
            return false;
        }
        if (rt.left == null && rt.right == null && o.left == null
            && o.right == null) {
            return true;
        }
        return (equalHelper(rt.left, o.left) && equalHelper(rt.right, o.right));
        
    }

    /**
     * Inserts c into this BstADT. The BST property must be preserved. 
     * Duplicates are not allowed.
     * @param c char to be inserted
     * @throws IllegalArgumentException if c already exists
     */
    @Override
    public void insert(Character c) {
        root = insertHelp(root, c);
    }
    
    /**
     * Helper method for insert()
     * @param n Node
     * @param c char being inserted
     * @return n with c inserted
     */
    public Node insertHelp(Node n, char c) {
        if (n == null) {                        //Found the spot to insert
            Node temp = new Node(c, null, null);
            return temp;
        }
        if (n.getVal() == c) {                  //Checks if c is already present
            throw new IllegalArgumentException();
        }
        
        if (c < n.getVal()) {                   //Traverse left
            n.left = insertHelp(n.left, c);
            return n;
        }
        else {                                  //Traverse right
            n.right = insertHelp(n.right, c);
            return n;
        }
    }


    /**
     * Gets a string representing the preorder traversal of this BstADT.
     *  The string must contain only the Characters of this BstADT. In particular, 
     *  do not add any punctuation or whitespace. Consequently, the preorder 
     *  traversal of an empty BstADT is the empty string, "".
     *  
     * @return preorder traversal
     */
    @Override
    public String preorder() {
        return preorderHelper(root);
    }
    
    /**
     * Helper method for preorder() which allows for recursive traversal
     * @param n Node
     * @return preorder string
     */
    public String preorderHelper(Node n) {
        if (n == null) {
            return "";
        }
        return n.getVal() + preorderHelper(n.left) + preorderHelper(n.right);
    }


    /**
     * Removes c from this BstADT. The BST property must be preserved.
     * If c is not there, do nothing
     * @param c Character to remove
     */
    @Override
    public void remove(Character c) {
        root = removeHelper(root, c);
    }
    
    /**
     * Helper method for remove
     * @param n Node being modified
     * @param c char being removed
     * @return the modified node to become the root
     */
    public Node removeHelper(Node n, char c) {
        if (n == null) {
            return n;
        }
        if (c < n.getVal()) {
            n.left = removeHelper(n.left, c);
            return n;
        }
        else if(c > n.getVal()){
            n.right = removeHelper(n.right, c);
            return n;
        }
        else {
            if (n.left == null) { //kid on right OR no kids, returns the right kid
                return n.right;
            }
            else if (n.right == null) { //kid on left, returns the left kid
                return n.left;
            }
            else {  //two kids, max value from left subtree must become new root
                Node temp = getmax(n.left); //get max value from left
                n.setVal(temp.getVal());    //set value of n to max value
                n.left = deletemax(n.left); //delete the max value from left
                 }
        }
        return n;
    }
    
    
    private Node getmax(Node n) {
        if (n.right == null) {
            return n;
        }
        return getmax(n.right);
    }
    
    private Node deletemax(Node n) {
        if (n.right == null) {
            return n.left;
        }
        n.right = deletemax(n.right);
        return n;
    }
    /**
     * 
     * Returns the preorder traversal of this BstADT, but starts with a left-angle 
     * bracket (<) and ends with a right-angle bracket (>), and the values in the 
     * preorder traversal are separated by commas. For example, the BstADT with 
     * root b, left kid a, right kid c would have a toString() of "<b,a,c>". Note 
     * that there are no spaces involved.
     */
    @Override
    public String toString() {
        String to = preorderHelper(root);
        String fin = "<";
        for (int i = 0; i < to.length(); i++) {
            if (i != 0) {
                fin += ",";
            }
            fin += to.charAt(i);
            }
        return fin += ">";
    }

}
