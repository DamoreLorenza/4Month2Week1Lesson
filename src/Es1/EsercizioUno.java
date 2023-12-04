package Es1;
import java.util.Random;
import java.util.Scanner;
public class EsercizioUno {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int lunghezza = 5;
        int[] array = new int[lunghezza];

        for (int i = 0; i < lunghezza; i++) {
            array[i] = randomNumber.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero (0 per uscire): ");
            int numeroInserito = scanner.nextInt();

            if (numeroInserito == 0) {
                break;
            }

            System.out.print("Inserisci la posizione dell'array (da 1 a 5): ");
            int posizione = scanner.nextInt();

            if (posizione >= 1 && posizione <= 5) {
                array[posizione - 1] = numeroInserito;

                System.out.print("Nuovo stato dell'array: ");
                printArray(array);
            } else {
                System.out.println("Posizione non valida. Inserisci una posizione tra 1 e 5.");
            }
        }

        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    }

