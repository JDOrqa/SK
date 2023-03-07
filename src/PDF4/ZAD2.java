package PDF4;

import java.util.Scanner;

public class ZAD2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj szybkość pojazdu (km/h): ");
        double szybkosc = scanner.nextDouble();
        System.out.print("Podaj czas (w godzinach): ");
        double czas = scanner.nextDouble();

        double odleg = szybkosc*czas;
      for(int i=1;i<=czas;i++) {
          double odleg1=szybkosc*i;
          System.out.println("Godzina Przebyta odległość: \n" + i + " " + odleg1);
      }
    }
}


