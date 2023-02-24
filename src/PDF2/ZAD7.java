package PDF2;

import java.util.Scanner;

public class ZAD7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj trzy imiona:");


        String imie1 = input.nextLine();
        String imie2 = input.nextLine();
        String imie3 = input.nextLine();


        System.out.println("Imiona posortowane rosnąco:");
        if (imie1.compareTo(imie2) <= 0 && imie1.compareTo(imie3) <= 0) {
            System.out.println(imie1);
            if (imie2.compareTo(imie3) <= 0) {
                System.out.println(imie2);
                System.out.println(imie3);
            } else {
                System.out.println(imie3);
                System.out.println(imie2);
            }
        } else if (imie2.compareTo(imie1) <= 0 && imie2.compareTo(imie3) <= 0) {
            System.out.println(imie2);
            if (imie1.compareTo(imie3) <= 0) {
                System.out.println(imie1);
                System.out.println(imie3);
            } else {
                System.out.println(imie3);
                System.out.println(imie1);
            }
        } else {
            System.out.println(imie3);
            if (imie1.compareTo(imie2) <= 0) {
                System.out.println(imie1);
                System.out.println(imie2);
            } else {
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }
    }
}

