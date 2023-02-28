package PDF3;

import java.util.Scanner;
public class ZAD3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String slowo;

        do {

            System.out.print("Wprowadź słowo (Tak, Nie):  ");
            slowo= input.nextLine();

        } while (!slowo.equalsIgnoreCase("Tak") && !slowo.equalsIgnoreCase("Nie") || !Character.isUpperCase(slowo.charAt(0)) );

        System.out.println("Wprowadzone słowo jest poprawne.");
    }
}










