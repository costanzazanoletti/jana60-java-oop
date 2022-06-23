package jana60.inheritance.shop;

public class Smartphone extends Prodotto {


  // attributi
  private String imei;
  private String memoria;

  // costruttori
  public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei,
      String memoria) {
    super(codice, nome, marca, prezzo, iva);
    this.imei = imei;
    this.memoria = memoria;
  }

  // metodi getter e setter
  public String getMemoria() {
    return memoria;
  }

  public void setMemoria(String memoria) {
    this.memoria = memoria;
  }

  public String getImei() {
    return imei;
  }


  @Override
  public String toString() {
    return super.toString() + " - " + getImei() + " - " + getMemoria();
  }

}
