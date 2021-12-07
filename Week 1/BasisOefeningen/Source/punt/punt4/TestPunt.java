package punt.punt4;

public class TestPunt {
    public static void main(String[] args) {
        Punt[] punten = {
                new Punt(),
                new Punt3D(),
                new Punt(2, 3),
                new Punt3D(4, 5, 6)
        };
        for (Punt punt : punten) {
            System.out.println(punt);
        }
    }
}

