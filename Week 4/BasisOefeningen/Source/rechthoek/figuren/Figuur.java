package rechthoek.figuren;


public abstract class Figuur implements Berekenbaar {
    private String soort;

    protected Figuur(String soort) {
        this.soort = soort;
    }

    @Override
    public String toString() {
        return "Soort: \"" + soort + "\"";
    }
}

