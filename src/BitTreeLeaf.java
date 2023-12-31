/**
 * Leaf of a BitTree.
 *
 * @author Reed Colloton
 */
class BitTreeLeaf extends BitTreeNode {
  String value;

  /**
   * Constructor
   */
  BitTreeLeaf(String bits, String value) {
    super(bits);
    this.value = value;
  } // BitTreeNode

  /**
   * Is it a leaf?
   */
  @Override
  boolean isLeaf() {
    return true;
  } // isLeaf()

} // class BitTreeNode
