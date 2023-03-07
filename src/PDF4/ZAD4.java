
package PDF4;
import java.util.Scanner;

public class ZAD4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni = 0;
        while (dni < 1) {
            System.out.print("Podaj liczbę dni przepracowanych przez pracownika: ");
            dni = scanner.nextInt();
            if (dni < 1) {
                System.out.println("Liczba dni musi być większa lub równa 1.");
            }
        }

        double wynagrodzenie = 0.01;
        double suma = 0.01;

        System.out.println("Dzień\tWynagrodzenie");
        System.out.println("----\t-------------");
        for (int dzien = 1; dzien <= dni; dzien++) {
            System.out.printf(+dzien+"\t \t \t"+wynagrodzenie+" zł\n");
            if (dzien < dni) {
                wynagrodzenie *= 2;
                suma += wynagrodzenie;
            }
        }
        System.out.printf("Suma wynagrodzeń za "+ dni+ " dni: "+suma +" zł\n");
    }
}



