package PDF3;

import java.util.Scanner;
public class ZAD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String litera;

        do {

            System.out.print("Wprowadź literę (T, t, N, n):  ");
            litera= input.nextLine();

        } while (litera.equals('T')  || litera.equals('t') ||litera.equals('N') ||litera.equals('n') );

        System.out.println("Wprowadzona litera jest poprawna.");
    }
}










