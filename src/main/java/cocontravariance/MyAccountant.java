package cocontravariance;

import java.util.ArrayList;
import java.util.List;

public class MyAccountant {

  public static void addClients(List<? super Corporation> lt) {
    Corporation c = null;
    lt.add(c);
  }

  public static void doTaxes(Taxable[] ta) {
    for (Taxable t : ta) {
      //
    }

    // attempt to assign to array is CHECKED at runtime
    // might throw ArrayStoreException...
  }

  public static void doTaxes(List<? extends Taxable> lt) {
//  public static void doTaxes(List<Taxable> lt) {
//  public static void doTaxes(List<E extends Taxable> lt) {
//    E thingy = lt.get NO, E has no type at runtime!!!! type erasure
    for (Taxable t : lt) {
      // compute taxes
    }

    // NONE WORK!!!!
//    Individual in = null;
//    Corporation in = null;
//    Taxable in = null;
//    lt.add(in);
  }

  public static void main(String[] args) {
    List<Taxable> lt = new ArrayList<>();
    doTaxes(lt);

    // Joe, only works with Individuals
    List<Individual> joesClients = new ArrayList<>();
    doTaxes(joesClients);

    List<Corporation> fredsClients = new ArrayList<>();
    doTaxes(fredsClients);

    Individual[] ia = new Individual[10];
    doTaxes(ia);

    addClients(fredsClients);
    addClients(lt);

//    addClients(joesClients);

    List<Object> lo = new ArrayList<>();
    addClients(lo);
  }
}
