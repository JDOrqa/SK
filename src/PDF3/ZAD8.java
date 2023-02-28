package PDF3;
import java.util.Scanner;

public class ZAD8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 0;

        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        product = number * 10;

        while (product < 100) {
            product *= 10;
            System.out.println("Wynik: " + product);
        }
    }
}
