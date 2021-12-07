package punt.punt1;

public class Punt3D extends Punt
{
    //Attributes
    private int z;

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
}
