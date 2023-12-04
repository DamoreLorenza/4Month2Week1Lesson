package Es2;

import java.util.Random;
import java.util.Scanner;
public class EsercizioDue {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci km percorsi: ");
            int kmPercorsi = scanner.nextInt();
            System.out.print("Inserisci litri carburante consumato: ");
            int lConsumati = scanner.nextInt();

            if (lConsumati == 0 && kmPercorsi != 0) {
                throw new IllegalArgumentException("Il consumo di carburante non può essere pari a zero.");
            }

            double consumoMedio = (double) kmPercorsi / lConsumati;
            System.out.println("Il consumo medio è: " + consumoMedio + " km/l");
        } catch (Exception e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}

