
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author johnmadaj
 *  @version 20210422
 */
public class Node {

    private char value;
    /** left is left kid. */
    Node left;
    /** right is right kid. */
    Node right;
    
 
    /**
     * Create a new Node object.
     * @param c char
     */
    public Node(char c) {
        value = c;
        left = null;
        right = null;
    }
    
    /**
     * Create a new Node object.
     * @param c char
     * @param l left
     * @param r right
     */
    public Node(char c, Node l, Node r) {
        value = c;
        left = l;
        right = r;
    }
    
    /**
     * Place a description of your method here.
     * @return value
     */
    public char getVal() {
        
        return value;
    }

    /**
     * Place a description of your method here.
     * @param val new value
     */
    public void setVal(char val) {
        value = val;
    }

}
