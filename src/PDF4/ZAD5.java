



package PDF4;
import java.util.Scanner;

public class ZAD5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz łańcuh znaków: ");
        String ciag = scanner.nextLine();
        System.out.print("Wpisz znak: ");
      char znak = scanner.nextLine().charAt(0);
      int suma=0;
        for(int i =0; i<ciag.length();i++) {
        if(ciag.charAt(i)==znak){
            suma++;
        }

        }
        System.out.print("Liczba wystąpień: " + suma);
    }
}



