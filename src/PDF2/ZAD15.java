package PDF2;

import java.util.Scanner;

public class ZAD15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wprowadź liczbę czeków wystawianych w danym miesiacu: ");
        double czek = input.nextDouble();
        double oplataP = 10;


        if(czek < 20) {
            double oplata1 = oplataP+(czek*0.10);
            System.out.println("Kowta pobranych opłat: " + oplata1+"\n");
        } else if(czek >= 20 && czek <=39) {
            double oplata2 = oplataP+(czek*0.08);
            System.out.println("Kowta pobranych opłat: " + oplata2+"\n");
        }else if(czek >= 40 && czek <=59) {
            double oplata3 = oplataP+(czek*0.06);
            System.out.println("Kowta pobranych opłat: " + oplata3+"\n");
        }else if(czek >= 60) {
            double oplata4 = oplataP+(czek*0.04);
            System.out.println("Kowta pobranych opłat: " + oplata4+"\n");
        }



    }

}
