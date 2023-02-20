public class ZAD22 {
    public static void main(String[] args) {
        int liczbaAkcji = 1000;
        double cenaZakupu = 32.87;
        double prowizjaKupno = cenaZakupu * 0.02;
        double cenaSprzedazy = 33.92;
        double prowizjaSprzedaz = cenaSprzedazy * 0.02;

        double cenaZakupuCalosc = liczbaAkcji * cenaZakupu;
        double prowizjaKupnoCalosc = liczbaAkcji * prowizjaKupno;
        double cenaSprzedazyCalosc = liczbaAkcji * cenaSprzedazy;
        double prowizjaSprzedazCalosc = liczbaAkcji * prowizjaSprzedaz;

        double zysk = (cenaSprzedazyCalosc - prowizjaSprzedazCalosc)
                - (cenaZakupuCalosc + prowizjaKupnoCalosc);

        System.out.println("Kwota zapłacona za akcje: " + cenaZakupuCalosc + " zł");
        System.out.println("Wartość prowizji przy zakupie: " + prowizjaKupnoCalosc + " zł");
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + cenaSprzedazyCalosc + " zł");
        System.out.println("Wartość prowizji przy sprzedaży: " + prowizjaSprzedazCalosc + " zł");
        System.out.println("Zysk ze sprzedaży akcji po zapłaceniu prowizji: " + zysk + " zł");
    }
}
