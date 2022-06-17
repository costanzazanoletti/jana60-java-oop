package jana60.valutazioni;

public class Studente {
  // attributi
  int idStudente;
  int percentualeAssenze;
  double mediaVoti;

  // costruttore
  Studente(int idStudente, int percentualeAssenze, double mediaVoti) {
    super();
    this.idStudente = idStudente;
    this.percentualeAssenze = percentualeAssenze; // tra 0 e 100
    this.mediaVoti = mediaVoti; // tra 0.0 e 5.0
  }


  // metodi

  /*
   * - se lo studente ha fatto più del 50% di assenze è bocciato - se ha fatto tra il 25% e il 50%
   * di assenze è promosso solo se la media dei voti è superiore a 2 - se ha fatto meno del 25% di
   * assenze è promosso se la media dei voti è superiore o uguale a 2
   */
  boolean isPromosso() {
    boolean isPromosso;
    if (percentualeAssenze > 50) {
      isPromosso = false;
    } else if (percentualeAssenze >= 25 && percentualeAssenze <= 50) {
      isPromosso = mediaVoti > 2.0;
    } else {
      isPromosso = mediaVoti >= 2.0;
    }

    return isPromosso;
  }

}
