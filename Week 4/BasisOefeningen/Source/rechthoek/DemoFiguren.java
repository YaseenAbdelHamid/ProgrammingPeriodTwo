package rechthoek;

import rechthoek.figuren.Cirkel;
import rechthoek.figuren.Figuur;
import rechthoek.figuren.Rechthoek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoFiguren {
    public static void main(String[] args) {
        Rechthoek rechthoek = new Rechthoek(5, 5);
        rechthoek.setBreedte(120);
        // Array van Figuur-objecten:
        Figuur[] figuren = {
                new Rechthoek(5, 5),
                new Cirkel(20),
                new Rechthoek(8, 8)
        };
        //List van Figuur-objecten:
        List<Figuur> figurenList = new ArrayList<>(Arrays.asList(figuren));

        //Polymorfisme:
        for (Figuur figuur : figurenList) {
            System.out.println(figuur.toString());
            System.out.printf("  omtrek: %.2f\n", figuur.omtrek());
            System.out.printf("  oppervlakte: %.2f\n", figuur.oppervlakte());
        }
    }
}
