package PDF4;
import java.util.Scanner;

public class ZAD16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budzet;
        double wydatki = 0;


        System.out.print("Podaj miesięczny budżet: ");
        budzet = scanner.nextDouble();


        while (wydatki <= budzet) {
            System.out.print("Podaj wydatek (lub wpisz \"-99\" aby zakończyć): ");
            double wydatek = scanner.nextDouble();
            if (wydatek == -99) {
                break;
            }

            wydatki += wydatek;
        }



        double roznica = wydatki - budzet;
        if(roznica >0) {
            System.out.printf("Wydatki wyniosły " + wydatki + " a przekroczenie budżetu wyniosło " + roznica);

        }
        if(roznica <=0) {
           roznica= -roznica;
            System.out.printf("Wydatki wyniosły " + wydatki + " a roznica wynosi " + roznica);
        }
    }
}






