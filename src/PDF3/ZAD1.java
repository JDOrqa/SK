package PDF3;

import java.util.Scanner;
public class ZAD1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba;

        do {

            System.out.print("Wprowadź liczbę z przedziału od 10 do 24: ");
            liczba = input.nextInt();

        } while (liczba < 10 || liczba > 24);

        System.out.println("Wprowadzona liczba jest poprawna.");
    }
}










