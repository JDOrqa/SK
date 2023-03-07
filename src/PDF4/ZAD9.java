package PDF4;
import java.util.Scanner;



public class ZAD9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczbaOrganizmow;
        double sredniPrzyrost;
        int liczbaDni;


        do {
            System.out.print("Podaj początkową liczbę organizmów (więcej niż 1): ");
            liczbaOrganizmow = input.nextInt();
        } while (liczbaOrganizmow < 2);


        do {
            System.out.print("Podaj średni dzienny przyrost populacji (w procentach): ");
            sredniPrzyrost = input.nextDouble();
        } while (sredniPrzyrost < 0);


        do {
            System.out.print("Podaj liczbę dni rozmnażania (więcej niż 0): ");
            liczbaDni = input.nextInt();
        } while (liczbaDni < 1);


        System.out.println("Wielkość populacji na kolejne dni:");
        double wielkoscPopulacji = liczbaOrganizmow;
        for (int dzien = 1; dzien <= liczbaDni; dzien++) {
            System.out.printf("Dzień "+dzien+" "+wielkoscPopulacji +"\n ");
            wielkoscPopulacji += (sredniPrzyrost / 100) * wielkoscPopulacji;
        }
    }
}




