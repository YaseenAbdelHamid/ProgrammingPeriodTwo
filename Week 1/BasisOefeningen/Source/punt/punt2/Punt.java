package punt.punt2;

public class Punt
{
    //Attributes
    private int x;
    private int y;

    //Default Constructor
    public Punt()
    {

    }

    //Constructor
    public Punt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Getters
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    //toString


    @Override
    public String toString()
    {
        return "\n\tx: " + x + "\n\ty: " + y;
    }
}
