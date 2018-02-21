package shopping;

public class ClothingPair<E extends /* OneClass & */ Colored & Sized/*, F*/> extends Pair<E> {
//  private F thingy;
//  {
//    thingy = new Object();
//  }

  public ClothingPair(E left, E right) {
    super(left, right);
  }

//  public void setThingy(F thingVal) {
//    this.thingy = thingVal;
//  }

  public boolean isMatched() {
    // "could" (but shouldn't!!!!) use instanceof and cast
    return left.getColor().equals(right.getColor()) &&
        left.getSize() == right.getSize();
  }

  public <F> F doStuff(E third, F otherThing, F yetAnotherThing) {
    return null;
  }

  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getColor().equals(right.getColor()) &&
        left.getSize() == right.getSize();
  }
}
