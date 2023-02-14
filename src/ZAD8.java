import java.util.Scanner;
public class ZAD8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int p1D;
        System.out.println("Podaj dlugosc pokoju 1: ");
        p1D = klawisz.nextInt();
        klawisz.nextLine();
        int p1S;
        System.out.println("Podaj szerokosc pokoju 1: ");
        p1S = klawisz.nextInt();
        klawisz.nextLine();

        int p2D;
        System.out.println("Podaj dlugosc pokoju 2: ");
        p2D = klawisz.nextInt();
        klawisz.nextLine();
        int p2S;
        System.out.println("Podaj szerokosc pokoju 2: ");
        p2S = klawisz.nextInt();
        klawisz.nextLine();

        int p3D;
        System.out.println("Podaj dlugosc pokoju 3: ");
        p3D = klawisz.nextInt();
        klawisz.nextLine();
        int p3S;
        System.out.println("Podaj szerokosc pokoju 3: ");
        p3S = klawisz.nextInt();
        klawisz.nextLine();

        int p4D;
        System.out.println("Podaj dlugosc pokoju 4: ");
        p4D = klawisz.nextInt();
        klawisz.nextLine();
        int p4S;
        System.out.println("Podaj szerokosc pokoju 4: ");
        p4S = klawisz.nextInt();
        klawisz.nextLine();

        int p1 = p1D * p1S;
        int p2 = p2D * p2S;
        int p3 = p3D * p3S;
        int p4 = p4D * p4S;
        int powierzchniaCalkowita = p1 + p2 + p3 + p4;
        int powierzchniaNaOsobe = powierzchniaCalkowita / 4;

        System.out.println("Powierzchnia pierwszego pomieszczenia: " + p1 + " metrów kwadratowych");
        System.out.println("Powierzchnia drugiego pomieszczenia: " + p2 + " metrów kwadratowych");
        System.out.println("Powierzchnia trzeciego pomieszczenia: " + p3 + " metrów kwadratowych");
        System.out.println("Powierzchnia czwartego pomieszczenia: " + p4 + " metrów kwadratowych");
        System.out.println("Całkowita powierzchnia mieszkania dla 1 osoby: " + powierzchniaCalkowita +
                " metrów kwadratowych");
        System.out.println("Powierzchnia mieszkania przypadająca na 1 osobę: " + powierzchniaNaOsobe +
                " metrów kwadratowych");
    }
}

