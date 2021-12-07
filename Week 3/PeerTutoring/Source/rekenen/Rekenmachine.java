package rekenen;

import rekenen.plugins.Plugin;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * PEER TUTORING
 * REKENMACHINE
 */
public class Rekenmachine {
    private final int MAX_AANTAL_PLUGINS = 10;
    private Plugin[] ingeladenPlugins;
    private int aantalPlugins;
    private StringBuilder log;

    public Rekenmachine() {
        this.ingeladenPlugins = new Plugin[MAX_AANTAL_PLUGINS];
        aantalPlugins = 0;
        log = new StringBuilder();
    }

    public void installeer(Plugin teInstallerenPlugin) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].equals(teInstallerenPlugin)) {
                System.out.println("Deze plugin is reeds geïnstalleerd.");
                return;
            }
        }
        ingeladenPlugins[aantalPlugins++] = teInstallerenPlugin;
    }

    public double bereken(String command, double x, double y) {
        for (int i = 0; i < aantalPlugins; i++) {
            if (ingeladenPlugins[i].getCommand().equals(command)) {
                addLogData(command, x, y, ingeladenPlugins[i].bereken(x, y), ingeladenPlugins[i].getAuteur());
                return ingeladenPlugins[i].bereken(x, y);
            }
        }
        System.out.println("Plugin ? niet geïnstalleerd.");
        return Double.POSITIVE_INFINITY;
    }

    private void addLogData(String command, double x, double y, double result, String auteur) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss");
        String formattedData = String.format("[%s] %f %s %f = %f (by %s)",
                LocalDateTime.now().format(dtf), x, command, y, result, auteur);
        log.append("\n").append(formattedData);
    }

    public String getLog() {
        String logString = log.toString();
        log.setLength(0);
        return logString;
    }

    @Override
    public String toString() {
        StringBuilder pluginLijst = new StringBuilder("Geïnstalleerde Plugins:");
        for (int i = 0; i < aantalPlugins; i++) {
            pluginLijst.append(" ").append(ingeladenPlugins[i].getCommand());
        }
        return pluginLijst.toString();
    }
}
