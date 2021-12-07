package rekenen.plugins;


public interface Plugin {
    String getCommand();
    double bereken(double x, double y);
    String getAuteur();
}