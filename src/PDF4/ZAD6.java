
package PDF4;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ZAD6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String nazwaPliku = scanner.nextLine();
        System.out.print("Podaj znak: ");
        char szukanyZnak = scanner.next().charAt(0);

        File plik = new File(nazwaPliku);
        int licznik = 0;

        try {
            Scanner plikScanner = new Scanner(plik);
            while (plikScanner.hasNextLine()) {
                String linia = plikScanner.nextLine();
                for (int i = 0; i < linia.length(); i++) {
                    if (linia.charAt(i) == szukanyZnak) {
                        licznik++;
                    }
                }
            }
            System.out.println("Liczba wystąpień znaku '" + szukanyZnak + "' w pliku " + nazwaPliku + " to: " + licznik);
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się otworzyć pliku: " + nazwaPliku);
            e.printStackTrace();
        }

    }

}



