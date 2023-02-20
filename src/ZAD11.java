
import java.util.Scanner;

    public class ZAD11 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Wprowadź wartość kupowanego produktu: ");
            double cena = input.nextDouble();
            double podatekStanowy = cena * 0.04;
            double podatekLokalny = cena * 0.02;
            double cenaLaczna = cena + podatekStanowy + podatekLokalny;
            System.out.printf("Wartość produktu: %.2f zł\n", cena);
            System.out.printf("Podatek stanowy: %.2f zł\n", podatekStanowy);
            System.out.printf("Podatek lokalny: %.2f zł\n", podatekLokalny);
            System.out.printf("Cena całkowita: %.2f zł\n", cenaLaczna);
        }

    }


