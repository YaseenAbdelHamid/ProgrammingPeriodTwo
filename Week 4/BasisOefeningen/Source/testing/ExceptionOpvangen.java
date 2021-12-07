package testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionOpvangen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tik 2 getallen: ");
        try {
            int g1 = scanner.nextInt();
            int g2 = scanner.nextInt();
            int division = g1 / g2;
            System.out.printf("%d / %d = %d", g1, g2, division);
        }
        catch (InputMismatchException ex)
        {
            System.out.println("Foutive invoer!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        catch (ArithmeticException ex2)
        {
            System.out.println("Kan niet delen door 0!");
        }
        }

}
