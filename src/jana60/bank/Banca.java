package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Banca {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Benvenuto/a a Java Bank");
    System.out.print("Inserisci il tuo nome: ");
    String inputUtente = scan.nextLine();
    int randomInt = random.nextInt(1000) + 1;

    Conto conto = new Conto(randomInt, inputUtente);

    System.out.print("Grazie abbiamo creato il conto numero " + conto.getNumeroConto());
    System.out.println(" intestato a " + conto.getProprietario());



    scan.close();
  }

}