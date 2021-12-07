package punt.punt4;

public class Punt
{
    //Attributes
    protected int x;
    protected int y;

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

    //Setters
    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    //toString
    @Override
    public String toString()
    {
        return "\n\tx: " + x + "\n\ty: " + y;
    }
}
