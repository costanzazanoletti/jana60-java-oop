package jana60.geometria;

public class Rettangolo {

  // 1) attributi della classe
  int base;
  int altezza;

  // 2) costruttori
  Rettangolo(int base, int altezza) {
    this.base = base;
    this.altezza = altezza;
  }

  Rettangolo() {
    this.base = 1;
    this.altezza = 1;
  }

  // 3) metodi della classe
  // metodo che calcola il perimetro
  int calcolaPerimetro() {
    return base * 2 + altezza * 2;
  }

  // metodo che calcola l'area
  int calcolaArea() {
    return base * altezza;
  }

}
