public class ZAD19 {
    public static void main(String[] args) {


        int ankietowani= 12467;
         double tygJeden= 0.14;
        double cytrynka= 0.64;
        int tyg= (int)(ankietowani*tygJeden);
        int cyt = (int)(ankietowani*cytrynka);


        System.out.printf("Przybliżona ilość osób kupująca jeden tygodniow: " + tyg +"\n");
        System.out.printf(" Przybliżona ilość osób kupująca cytrynke: " + cyt);
    }
}
