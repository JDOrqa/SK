package PDF4;
import java.io.*;

public class ZAD15 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj ścieżkę do pliku wejściowego: ");
            String inputPath = br.readLine();
            System.out.println("Podaj ścieżkę do pliku wyjściowego: ");
            String outputPath = br.readLine();


            reader = new BufferedReader(new FileReader(inputPath));
            writer = new BufferedWriter(new FileWriter(outputPath));


            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toUpperCase();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Plik został przetworzony.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

