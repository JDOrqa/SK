package PDF4;

import java.util.Scanner;

public class ZAD1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dodatnią niezerową liczbę całkowitą: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Suma liczb całkowitych od 1 do " + n + " wynosi " + sum + ".");
    }
}


