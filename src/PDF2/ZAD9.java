package PDF2;

import java.util.Scanner;

public class ZAD9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wagę przesyłki (w kg): ");
        double waga = input.nextDouble();
        System.out.print("Podaj odległość przesyłki (w km): ");
        int odleglosc = input.nextInt();

        double koszt = 0;
        if (waga <= 1) {
            koszt = 1.10;
        } else if (waga <= 3) {
            koszt = 2.20;
        } else if (waga <= 5) {
            koszt = 3.70;
        } else {
            koszt = 3.80;
        }
        koszt *= Math.ceil(odleglosc / 500.0);


        System.out.println("Koszt przesyłki: " + koszt + " zł");
    }
}