package datum;
import java.util.Scanner;


public class DatumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        do {
            System.out.print("Geef een datum (dd/mm/jjjj): ");
            String str = scanner.nextLine();
            Datum datum = new Datum(str);
            System.out.println("korte datum: " + datum.getKorteDatum());
            System.out.println("lange datum: " + datum.getLangeDatum());
            correct = true;
        }
        while (!correct);
    }
}
