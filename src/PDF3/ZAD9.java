package PDF3;
import java.util.Scanner;

public class ZAD9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean powtorka = true;
        do {
            System.out.print("Wprowadź pierwszą liczbę: ");
            int numer1 = scanner.nextInt();
            System.out.print("Wprowadź drugą liczbę: ");
            int numer2 = scanner.nextInt();
            int suma = numer1 + numer2;
            System.out.println("Suma tych liczb wynosi: " + suma);

            System.out.print("Czy chcesz kontynuować? (Tak/Nie) ");
            String odp = scanner.next();
            powtorka = odp.equalsIgnoreCase("Tak");
        } while (powtorka);
    }
}


