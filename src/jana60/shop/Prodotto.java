package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
  // attributi
  String marca;
  String nome;
  double prezzo;
  int iva; // ad es. 22



  // costruttore
  Prodotto(String marca, String nome, double prezzo, int iva) {
    super();
    this.marca = marca;
    this.nome = nome;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // metodi
  double calcolaPrezzoConIva() {
    return prezzo + prezzo * iva / 100;
  }

  // overload dei metodi
  String formattaPrezzo(String pattern) {
    DecimalFormat df = new DecimalFormat(pattern);
    return df.format(calcolaPrezzoConIva());
  }

  String formattaPrezzo() {
    DecimalFormat df = new DecimalFormat("0.00€");
    return df.format(calcolaPrezzoConIva());
  }

  String formattaPrezzo(DecimalFormat df) {
    return df.format(calcolaPrezzoConIva());
  }

  String infoProdotto() {
    String infoProdotto = "Marca: " + marca;
    infoProdotto += "\nNome: " + nome;
    infoProdotto += "\nPrezzo: " + formattaPrezzo();

    return infoProdotto;
  }

  void setPrezzo(double prezzo) {
    if (prezzo < 0.0) {
      // ritorno un errore o modifico il dato che mi è stato passato
      this.prezzo = -prezzo;
    } else {
      this.prezzo = prezzo;
    }
  }

}
