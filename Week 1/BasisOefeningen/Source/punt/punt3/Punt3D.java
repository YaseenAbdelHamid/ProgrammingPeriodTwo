package punt.punt3;

public class Punt3D extends Punt
{
    //Attributes
    private int z;

    //Default Constructor
    public Punt3D()
    {

    }

    //Constructor
    public Punt3D(int x, int y, int z)
    {
        super(x, y);
        this.z = z;
    }

    //Getters
    public int getZ()
    {
        return z;
    }

    //Setters
    public void setZ(int z)
    {
        this.z = z;
    }

    //toString
    @Override
    public String toString()
    {
        return "\n\tx: " + x + "\n\ty: " + y + "\n\tz: " +z;
    }
}
