package rechthoek.figuren;

/**
 * Klasse Cirkel erft over van Figuur en implementeert de methoden omtrek en oppervlakte
 */
public class Cirkel extends Figuur {
    private int straal;

    public Cirkel(int straal) {
        super("Cirkel");
        this.straal = straal;
    }

    public void setStraal(int straal) {
        this.straal = straal;
    }

    @Override
    public double omtrek() {
        return 2 * Math.PI * straal;
    }

    @Override
    public double oppervlakte() {
        return Math.PI * straal * straal;
    }

    @Override
    public String toString() {
        return String.format("%s Omtrek: %.2f - Oppervlakte: %.2f",
                super.toString(),
                omtrek(), oppervlakte());
    }
}
