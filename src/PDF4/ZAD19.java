package PDF4;
import java.util.Random;
import java.util.Scanner;

public class ZAD19 {

    public static void main(String[] args) {
        String[] kolory = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int poprawne = 0;

        for (int i = 0; i < 10; i++) {
            int losowyIndeks = rand.nextInt(kolory.length);
            String wylosowanyKolor = kolory[losowyIndeks];
            System.out.println("Podaj nazwę koloru: ");
            String podanyKolor = scanner.nextLine();

            if (wylosowanyKolor.equalsIgnoreCase(podanyKolor)) {
                System.out.println("Poprawna odpowiedź!");
                poprawne++;
            } else {
                System.out.println("Niepoprawna odpowiedź! Wylosowany kolor to: " + wylosowanyKolor);
            }
        }

        System.out.println("Liczba poprawnych odpowiedzi: " + poprawne);
    }

}











