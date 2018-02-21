package shopping;

import java.time.LocalDate;

public class Shop {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Fred", "Jones");
//    ClothingPair<String> p = new ClothingPair<>("Fred", "Jones");
    String s = p.getLeft();

//    Pair<Shoe> ps =
//        new Pair<Object>(new Shoe("Brown"), "WHAT");
    ClothingPair<Shoe> ps = new ClothingPair<>(
        new Shoe("Brown", 44), new Shoe("Black", 44));
    Shoe l = ps.getLeft();

    ClothingPair<Shoe> ps2 = new ClothingPair<>(
        new Shoe("Brown", 45), new Shoe("Brown", 43));
    System.out.println("ps is matched? " + ps.isMatched());
    System.out.println("ps2 is matched? " + ps2.isMatched());

    ClothingPair<Shoe> ps3 = new ClothingPair<>(
        new Shoe("Brown", 43), new Shoe("Brown", 43));
    System.out.println("ps3 is matched? " + ps3.isMatched());

    Shoe s1 = new Shoe("Brown", 42);
    Shoe s2 = new Shoe("Blue", 42);
    Shoe s3 = new Shoe("Brown", 42);
    System.out.println("Static match is " + ClothingPair.match(s1, s2));
    System.out.println("Static match is " + ClothingPair.match(s1, s3));
  }
}
