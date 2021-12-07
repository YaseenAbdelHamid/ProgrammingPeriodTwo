package rekenen.plugins;

public class Gemiddelde implements Plugin {
    @Override
    public String getCommand() {
        return "AVG";
    }

    @Override
    public double bereken(double x, double y) {
        return (x + y) / 2;
    }

    @Override
    public String getAuteur() {
        return "Siebe";
    }
}
