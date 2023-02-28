package PDF2;

import java.util.Scanner;

public class ZAD16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź liczbę książek zakupionych w tym miesiącu: ");
        double ksi = input.nextDouble();
        double oplataP = 10;


        if(ksi == 0) {
            System.out.println("Otrzymujesz 0 punktów: " + "\n");
        } else if(ksi == 1) {
            System.out.println("Otrzymujesz 5 punktów: " + "\n");
        }else if(ksi == 2) {
            System.out.println("Otrzymujesz 15 punktów: " + "\n");
        }else if(ksi == 3) {
            System.out.println("Otrzymujesz 30 punktów: " + "\n");
        }else if(ksi >= 4) {
            System.out.println("Otrzymujesz 60 punktów: " + "\n");
        }



    }

}
