package shopping;

// Type variable DECLARATION
//                v
public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public E getRight() {
    return right;
  }
}
