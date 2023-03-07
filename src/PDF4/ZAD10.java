package PDF4;
import java.util.Scanner;



public class ZAD10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int liczba;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.print("Podaj liczbę: ");
            liczba = input.nextInt();
            if (liczba < min && liczba != -99) {
                min = liczba;
            }

            if (liczba > max && liczba != -99) {
                max = liczba;
            }

        } while (liczba  != -99);


        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Największa liczba: " + max);

}
}




