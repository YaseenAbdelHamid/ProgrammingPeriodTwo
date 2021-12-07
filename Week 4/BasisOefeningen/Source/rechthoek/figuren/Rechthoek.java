package rechthoek.figuren;

/**
 * Klasse Rechthoek erft over van Figuur en implementeert de methoden omtrek en oppervlakte
 */
public class Rechthoek extends Figuur {
    private double breedte;
    private double hoogte;

    public Rechthoek(double breedte, double hoogte) {
        super("Rechthoek");
        setBreedte(breedte);
        setHoogte(hoogte);
    }

    public void setBreedte(double breedte)
    {
        if (breedte<=0)
        {
            throw new IllegalArgumentException("Breedte moet positief zijn.");
        }
        this.breedte = breedte;
    }

    public void setHoogte(double hoogte) {
        if (hoogte<=0)
        {
            throw new IllegalArgumentException("Hoogte moet positief zijn.");
        }
        this.hoogte = hoogte;
    }

    @Override
    public double omtrek() {
        return 2 * breedte + 2 * hoogte;
    }

    @Override
    public double oppervlakte() {
        return breedte * hoogte;
    }

    @Override
    public String toString() {
        return String.format("%s Omtrek: %.2f - Oppervlakte: %.2f",
                super.toString(),
                omtrek(), oppervlakte());
    }
}
