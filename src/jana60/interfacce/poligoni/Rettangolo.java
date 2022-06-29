package jana60.interfacce.poligoni;

public class Rettangolo implements Poligono {

  private double base;
  private double altezza;

  public Rettangolo(double base, double altezza) throws IllegalArgumentException {
    if (base <= 0.0 || altezza <= 0.0) {
      throw new IllegalArgumentException("i lati devono essere tutti maggiori di 0");
    }

    this.base = base;
    this.altezza = altezza;
  }

  @Override
  public double calcolaPerimetro() {
    return base * 2 + altezza * 2;
  }

  @Override
  public double calcolaArea() {
    return base * altezza;
  }

  @Override
  public String toString() {
    return "Rettangolo di base " + base + " e altezza " + altezza;
  }



}
