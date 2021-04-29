
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 * 
 *  @author johnmadaj
 *  @version 20210414
 */
public interface BstADT {
    
    
    public boolean equals(Object o);
    
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
    public boolean equalTo(Object o);
    
    /**
     * Inserts c into this BstADT. The BST property must be preserved. 
     * Duplicates are not allowed.
        Throws:
        java.lang.IllegalArgumentException - if c is already in this BstADT
     * @param c char to be inserted
     */
    public void insert(Character c);
    
    /**
     * Gets a string representing the preorder traversal of this BstADT.
     *  The string must contain only the Characters of this BstADT. In particular, 
     *  do not add any punctuation or whitespace. Consequently, the preorder 
     *  traversal of an empty BstADT is the empty string, "".
     *  
     * @return preorder traversal
     */
    public String preorder();
    
    /**
     * Removes c from this BstADT. The BST property must be preserved.
     * If c is not there, do nothing
     * @param c - Character to remove
     */
    public void remove(Character c);
    
    
    public String toString();
    
}
