public class ZAD6 {
    public static void main(String[] args) {
        int p1 = 3 * 4;
        int p2 = 3 * 4;
        int p3 = 2 * 3;
        int p4 = 2 * 2;
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
