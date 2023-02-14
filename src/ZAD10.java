import java.util.Scanner;

public class ZAD10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String firstName;
        System.out.println("Podaj imie: ");
        firstName = klawisz.nextLine();
        klawisz.nextLine();
        String middleName;
        System.out.println("Podaj drugie imie: ");
        middleName = klawisz.nextLine();
        klawisz.nextLine();
        String lastName ;
        System.out.println("Podaj nazwisko: ");
        lastName = klawisz.nextLine();
        klawisz.nextLine();
    }
}
