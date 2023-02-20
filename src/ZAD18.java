

public class ZAD18 {

    public static void main(String[] args) {


        final int akcje= 600;
        final double cenaAkcji= 21.77;
        final double prowizja= 0.02;
         double wszystkieAkcje= akcje*cenaAkcji;

        double wysokoscProwizji = akcje*cenaAkcji*prowizja;
        double suma = akcje*cenaAkcji+wysokoscProwizji;

        System.out.printf("Cena wszystkich akcji: " + wszystkieAkcje + "\n");
        System.out.printf("Wartość prowizji: " + wysokoscProwizji +"\n");
        System.out.printf("Łączna kwota : " + suma);
    }

}
