package animals;

public class Fish extends AbstractAnimal
{
    public Fish(String name, int year)
    {
        super(name,year);
        // id=id+1;
        // this.id=id;
    }

    @Override
    public String breath()
    {
       return  "Gills";
    }

    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

    @Override
	public String toString()
	{
        // '\'' + ",id = " + id
        return "\nFish{" +
                "name = '" + name + '\'' +
                ", year = " + year  +
                '}';
	}
}