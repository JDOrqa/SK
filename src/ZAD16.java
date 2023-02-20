import java.util.Scanner;

public class ZAD16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj nazwę ulubionego miasta: ");
        String miasto = input.nextLine();

        int liczbaZnakow = miasto.length();
        String miastoWielkimiLiterami = miasto.toUpperCase();
        String miastoMalymiLiterami = miasto.toLowerCase();
        char pierwszyZnak = miasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + miastoWielkimiLiterami);
        System.out.println("Nazwa miasta zapisana małymi literami: " + miastoMalymiLiterami);
        System.out.println("Pierwszy znak nazwy miasta: " + pierwszyZnak);
    }

}
