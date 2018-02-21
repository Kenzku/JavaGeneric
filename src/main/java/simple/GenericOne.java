package simple;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericOne {
//  public static Object[] getAsArray(List ls, Class cl) {
//    String [] sa = (String [])Array.newInstance(String.class, 1);
//    sa[0] = ls.get(0);
//    return sa;
//  }

//  public static void addToList(List<LocalDate> l) {
  public static void addToList(List l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
//    List names = new ArrayList();
//    names.add("Fred");
//    names.add("Jim");
//    names.add("Sheila");
//
//    names.add(LocalDate.now());
//    String nameOne = (String)(names.get(0));
//    for(Object o : names) {
//      System.out.println("> " + o);
//    }

    List<String> names = Collections.checkedList(new ArrayList(), String.class);
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");

//    names.add(LocalDate.now());
    addToList(names);
    String nameOne = names.get(0); // CAST still exists!!!
    for(String s : names) {
      System.out.println("> " + s);
    }
  }
}
