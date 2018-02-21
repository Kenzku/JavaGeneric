package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class MyPredicate implements Predicate<CharSequence> {
  @Override
  public boolean test(CharSequence s) {
    return s.length() > 4;
  }
}

public class ShowFiltering {
  public static <E> List<E> filter(List<E> l, Predicate<? super E> t) {
    List<E> out = new ArrayList<>();
    for (E it : l) {
      if (t.test(it)) {
        out.add(it);
      }
    }
    return out;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Freddy", "Jim", "Sheila", "Bob");
    List<String> longNames = filter(ls, new MyPredicate());
    System.out.println("Result is: " + longNames);

    List<StringBuilder> lsb = Arrays.asList(
        new StringBuilder("FREDDY"),
        new StringBuilder("JIM"));
    System.out.println(filter(lsb, new MyPredicate()));
  }
}
