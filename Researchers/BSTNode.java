/**
 * this class implements a node.
 * It creates a node and allows it to set a left and right node
 */
public class BSTNode {
    Profile Profileresearcher;
    BSTNode l;
    BSTNode r;
    /**
     * @param elem Resets the Profile researcher.
     */
    public BSTNode(Profile elem){
        this.Profileresearcher=elem;
    }
    /**
     * @return The Profile researcher.
     */
    public Profile getResearcher() {
        return this.Profileresearcher;
    }
    /**
     * @param l Resets the left node.
     */
    public void setL(BSTNode l) {
        this.l = l;
    }
    /**
     * @param r Resets the right node.
     */
    public void setR(BSTNode r) {
        this.r = r;
    }
    /**
     * @return The left node.
     */
    public BSTNode getL() {
        return this.l;
    }
    /**
     * @return The right node.
     */
    public BSTNode getR() {
        return this.r;
    }


}

