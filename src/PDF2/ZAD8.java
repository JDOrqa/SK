package PDF2;

import java.util.Scanner;
public class ZAD8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe zakupionych pakietów : ");
        int pakiety = input.nextInt();
        double cena = pakiety*99;

        if(pakiety <10){
            System.out.print("Twój rabat wynosi 0% " + " A łączna cena to: " + cena);
            return;
        }
        else if(pakiety >=10 && pakiety <=19 ) {
            double crabat = cena * 0.8;

            System.out.print("Twój rabat wynosi 20% " + " A łączna cena to: " + crabat);
            return;
        } else if(pakiety >=20 && pakiety <=49 ) {
            double crabat = cena * 0.7;

            System.out.print("Twój rabat wynosi  30% "  + " A łączna cena to: " + crabat);
            return;
        }else if(pakiety >=50 && pakiety <=99 ) {
            double crabat = cena * 0.6;

            System.out.print("Twój rabat wynosi 40% "  + " A łączna cena to: " + crabat);
            return;
        }else if(pakiety >=100 ) {
            double crabat = cena * 0.5;

            System.out.print("Twój rabat wynosi 50% "  + " A łączna cena to: " + crabat);
            return;
        }

    }
}