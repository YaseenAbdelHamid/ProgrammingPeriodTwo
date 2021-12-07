import rekenen.*;
import java.util.Scanner;
import rekenen.plugins.*;

public class TestRekenmachine {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commandoInput;
        String twoNumberInput;
        double firstNumber;
        double secondNumber;

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());
        mijnCalc.installeer(new Plugin() {
            @Override
            public String getCommand() {
                return "MIN";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.min(x, y);
            }

            @Override
            public String getAuteur() {
                return "Anoniem";
            }
        });
        mijnCalc.installeer(new Plugin() {
            @Override
            public String getCommand() {
                return "MAX";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.max(x, y);
            }

            @Override
            public String getAuteur() {
                return "Anoniem";
            }
        });

        doeBerekeningEnDrukAf("+", 5, 2);
        doeBerekeningEnDrukAf("-", 5, 2);
        doeBerekeningEnDrukAf("*", 5, 2);
        doeBerekeningEnDrukAf("/", 5, 2);
        doeBerekeningEnDrukAf("^", 5, 2);
        doeBerekeningEnDrukAf("?", 5, 2);
        System.out.println(mijnCalc.toString());

        while (true) {
            System.out.print("\nWelke berekening wenst U uit te voeren (<ENTER> om te stoppen)? ");
            commandoInput = scanner.nextLine();
            if (commandoInput.isEmpty()) {
                break;
            }
            System.out.print("Geef twee getallen in (gescheiden door een spatie): ");
            twoNumberInput = scanner.nextLine();
            firstNumber = Double.parseDouble(twoNumberInput.split(" ")[0]);
            secondNumber = Double.parseDouble(twoNumberInput.split(" ")[1]);
            doeBerekeningEnDrukAf(commandoInput, firstNumber, secondNumber);
        }

        System.out.println("==== LOG ====" + mijnCalc.getLog());
    }

    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2){
        System.out.printf("%.2f %s %.2f = %.2f\n"
                , getal1, commando, getal2
                , mijnCalc.bereken(commando, getal1, getal2));
    }


}