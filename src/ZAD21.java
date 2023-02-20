import java.util.Scanner;

public class ZAD21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj kwotę początkową: ");
        double kwota = input.nextDouble();

        System.out.print("Podaj roczną stopę oprocentowania: ");
        double oprocentowanie = input.nextDouble() / 100.0;

        System.out.print("Podaj liczbę kapitalizacji w ciągu roku: ");
        int kapitalizacja = input.nextInt();

        System.out.print("Podaj liczbę lat: ");
        int lata = input.nextInt();

        double kapital = kwota * Math.pow(1 + oprocentowanie / kapitalizacja, kapitalizacja * lata);
        System.out.printf("Kwota na koncie po "+ lata + " latach wynosi "+kapital+" zł");
    }
}

