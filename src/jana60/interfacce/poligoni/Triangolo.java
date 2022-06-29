package jana60.interfacce.poligoni;

public class Triangolo implements Poligono {

  private double lato1, lato2, lato3;
  private double base, altezza;



  public Triangolo(double lato1, double lato2, double lato3, double base, double altezza) {
    super();
    this.lato1 = lato1;
    this.lato2 = lato2;
    this.lato3 = lato3;
    this.base = base;
    this.altezza = altezza;
  }

  @Override
  public double calcolaPerimetro() {
    return lato1 + lato2 + lato3;
  }

  @Override
  public double calcolaArea() {
    return base * altezza;
  }

}
