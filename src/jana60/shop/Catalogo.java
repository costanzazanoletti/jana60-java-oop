package jana60.shop;

import java.util.Scanner;

public class Catalogo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // creo l'array vuoto di Prodotto
    // Prodotto[] catalogo = new Prodotto[3];

    Prodotto nike = new Prodotto("Nike", "Air", 200.0, 22);
    Prodotto iphone = new Prodotto("Apple", "iphone", 799.0, 22);
    Prodotto fenix = new Prodotto("Garmin", "Fenix", 898.0, 22);

    Prodotto[] catalogo = {nike, iphone, fenix};



    // valorizzo l'array di Prodotto
    // for (int i = 0; i < catalogo.length; i++) {
    // // chiedo all'utente i dettagli del prodotto
    // System.out.print("Inserisci marca: ");
    // String marca = scanner.nextLine();
    // System.out.print("Inserisci nome: ");
    // String nome = scanner.nextLine();
    // System.out.print("Inserisci prezzo: ");
    // double prezzo = Double.parseDouble(scanner.nextLine());
    // System.out.print("Inserisci iva: ");
    // int iva = Integer.parseInt(scanner.nextLine());
    //
    // // con quei dettagli creo un Prodotto e lo assegno alla posizione corrente
    // catalogo[i] = new Prodotto(marca, nome, prezzo, iva);
    // }


    for (int i = 0; i < catalogo.length; i++) {

      System.out.println(catalogo[i].infoProdotto());
    }


  }

}
