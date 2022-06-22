package jana60.streaming;

public class Serie extends Contenuto {

  private int numeroDiEpisodi;

  // codice del costruttore implicito
  public Serie(String titolo, int numeroDiEpisodi) {
    super(titolo);
    this.numeroDiEpisodi = numeroDiEpisodi;
  }

  @Override
  public String toString() {
    return super.toString() + " in " + numeroDiEpisodi + " episodi";
  }
}
