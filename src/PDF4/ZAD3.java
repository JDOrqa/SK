
package PDF4;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZAD3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szybkość pojazdu (km/h): ");
        double szybkosc = scanner.nextDouble();
        System.out.print("Podaj czas (w godzinach): ");
        double czas = scanner.nextDouble();

        double odleg = szybkosc*czas;
        try {
            FileWriter writer = new FileWriter("wyniki.txt");
            for(int i=1;i<=czas;i++) {
                double odleg1=szybkosc*i;
                writer.write("Godzina Przebyta odległość: \n" + i + " " + odleg1 + "\n");
            }
            writer.write("Całkowita przebyta odległość: " + odleg);
            writer.close();
            System.out.println("Wyniki zapisane do pliku wyniki.txt.");
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisywania pliku.");
        }
    }
}
