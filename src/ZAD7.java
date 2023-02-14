public class ZAD7 {
    public static void main(String[] args) {
        double procentSprzedazy = 0.62;
        double calkowitaSprzedaz = 4600000;

        double sprzedazMazowiecki = procentSprzedazy * calkowitaSprzedaz;
        System.out.println("Sprzedaż w regionie mazowieckim wynosi: " + sprzedazMazowiecki + " zł");
    }
}
