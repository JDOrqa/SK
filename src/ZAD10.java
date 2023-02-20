import java.util.Scanner;

public class ZAD10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String firstName = input.nextLine();

        System.out.print("Podaj drugie imię: ");
        String middleName = input.nextLine();

        System.out.print("Podaj nazwisko: ");
        String lastName = input.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Inicjały: " + firstInitial + "." + middleInitial + "." + lastInitial + ".");
    }
}
