package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        //Attributes
        Scanner scanner = new Scanner(System.in);
        int getal;

        //Code
        System.out.println("Geef een getal tussen 1 en 10: ");

        try
        {
            getal = scanner.nextInt();
            if(getal >= 0 & getal <= 11 )
            {
                System.out.println(getal + " is een goed getal");
            }
        }
        catch(InputMismatchException a)
        {
            System.out.println("Het is een geen getal tussen 1 en 10");
        }
    }
}
