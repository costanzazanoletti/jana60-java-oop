package jana60.geometria;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Inserisci la base: ");
    int base = scan.nextInt();
    System.out.print("Inserisci l'altezza: ");
    int altezza = scan.nextInt();

    // Rettangolo r = new Rettangolo();
    // r.altezza = altezza;
    // r.base = base;

    Rettangolo r = new Rettangolo(base, altezza);

    System.out.println("Il perimetro è " + r.calcolaPerimetro());
    System.out.println("L'area è " + r.calcolaArea());

    scan.close();
  }

}
