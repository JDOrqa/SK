package PDF4;
import java.util.Random;
import java.util.Scanner;

public class ZAD17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tajnaLiczba = random.nextInt(100) + 1;
        int liczba = 0;


        System.out.println("Zgadnij liczbę z zakresu od 1 do 100.");

        while (liczba != tajnaLiczba) {
            System.out.print("Podaj swoją propozycję: ");
            liczba = scanner.nextInt();


            if (liczba > tajnaLiczba) {
                System.out.println("Za duża liczba, spróbuj ponownie.");
            } else if (liczba < tajnaLiczba) {
                System.out.println("Za mała liczba, spróbuj ponownie.");
            }
        }

        System.out.println("Gratulacje, zgadłeś liczbę ");
    }
}






