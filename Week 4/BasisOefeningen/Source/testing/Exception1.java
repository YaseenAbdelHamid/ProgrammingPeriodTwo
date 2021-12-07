package testing;

import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef 2 getallen: ");
        int deeltal = scanner.nextInt();
        int deler = scanner.nextInt();
        int quotiënt = deeltal / deler;
        System.out.println(deeltal + "/" + deler + " = " + quotiënt);
    }
}
