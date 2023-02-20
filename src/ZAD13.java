import java.util.Scanner;

public class ZAD13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LICZBA_CIASTECZEK_W_PUDELKU = 40;
        final int LICZBA_PORCJI_W_PUDELKU = 10;
        final int KALORIE_W_PORCJI = 300;
        System.out.print("Podaj liczbę zjedzonych ciasteczek: ");
        int liczbaCIASTECZEK = input.nextInt();
        int liczbaKALORII = KALORIE_W_PORCJI / 4 ;
        int liczbaZJEDZONYCH = liczbaCIASTECZEK *liczbaKALORII ;
        System.out.printf("Skonsumowałeś kalorii:" + liczbaZJEDZONYCH);
    }

}

