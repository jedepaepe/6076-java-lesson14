import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UpperCaseScannerExt {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Veuillez indiquer un nom de fichier");
            return;
        }
        String fileName = args[0];
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            System.out.println(text.toUpperCase());
        }
    }
}
