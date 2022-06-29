package jana60.interfacce.poligoni;

public class Main {

  public static void main(String[] args) {
    try {
      Rettangolo r1 = new Rettangolo(5.0, 7.5);
      System.out.println(r1);
      System.out.println("perimetro: " + r1.calcolaPerimetro());
      System.out.println("area: " + r1.calcolaArea());
    } catch (IllegalArgumentException e) {
      System.out.println("Parametri non validi: " + e.getMessage());
    }
  }

}
