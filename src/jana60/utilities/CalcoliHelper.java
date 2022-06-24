package jana60.utilities;

public class CalcoliHelper {

  // costruttore private
  private CalcoliHelper() {
    // non fa niente
  }

  // OVERLOAD
  // somma di due interi
  public static int somma(int x, int y) {
    return x + y;
  }

  // OVERLOAD
  // somma di due double
  public static double somma(double x, double y) {
    return x + y;
  }

  // differenza tra due interi
  public static int differenza(int x, int y) {
    return x - y;
  }

  // differenza tra due double
  public static double differenza(double x, double y) {
    return x - y;
  }

  // moltiplicazione tra due interi
  public static int moltiplicazione(int x, int y) {
    return x * y;
  }

  // divisione tra due interi
  public static double divisione(int x, int y) {
    return x / y;
  }

  // valore assoluto di un numero intero
  public static int valoreAssoluto(int x) {
    if (x < 0) {
      return -x;
    } else {
      return x;
    }
  }

  // minimo tra due numeri interi
  public static int minimo(int x, int y) {
    if (x < y) {
      return x;
    } else {
      return y;
    }
  }

  // massimo tra due numeri interi
  public static int massimo(int x, int y) {
    if (x > y) {
      return x;
    } else {
      return y;
    }
  }


  /*
   * elevo a potenza due numeri interi
   * - se esponente == 0 -> potenza = 1
   * - se esponente > 0 -> potenza = base * base * base ... * base
   * - se esponente < 0 -> potenza = 1/base * base * ... * base
   */
  public static double potenza(int base, int esponente) {
    // se esponente == 0 -> potenza = 1
    double potenza = 1;
    // se esponente != 0
    if (esponente != 0) {
      // calcolo potenza del valore assoluto di esponente
      for (int i = 0; i < valoreAssoluto(esponente); i++) {
        potenza *= base;
      }
    }
    // se esponente < 0 inverto la potenza
    if (esponente < 0) {
      potenza = 1 / potenza;
    }

    return potenza;

  }

}
