package datum;

public class Datum
{
    private static final String[] maandNamen =
            {
            "januari", "februari", "maart", "april", "mei", "juni", "juli",
            "augustus", "september", "oktober", "november", "december"
    };
    private int dag;
    private int maand;
    private int jaar;

    public Datum(int dag, int maand, int jaar)
    {
        //Opgave 1
        this.dag = dag;
        this.maand = maand;
        this.jaar = jaar;
    }

    public Datum(Datum datum) {
        this(datum.getDag(), datum.getMaand(), datum.getJaar());
    }

    public Datum(String datumStr) {
        //Opgave 2
    }

    public static boolean isGeldigeDatum(int dag, int maand, int jaar) {
        if (jaar < 1600)
            return false;
        else if (maand < 1 || maand > 12)
            return false;
        else if (dag < 1 || dag > 31)
            return false;
        else if (dag == 31 && (maand == 2 || maand == 4 || maand == 6 || maand == 9 || maand == 11))
            return false;
        else if (dag == 30 && maand == 2)
            return false;
        else return !(dag == 29 && maand == 2 && (jaar % 4 > 0 || jaar % 100 == 0) && jaar % 400 > 0);
    }

    public int getDag() {
        return dag;
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }

    public String getMaandNaam() {
        return maandNamen[maand - 1];
    }

    public String getLangeDatum() {
        //Opgave 3
        return "";
    }

    public String getKorteDatum() {
        //Opgave 4
        return "";
    }

    @Override
    public String toString() {
        return getLangeDatum();
    }
}