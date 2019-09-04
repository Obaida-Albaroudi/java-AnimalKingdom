package animals;

public class Mammals extends AbstractAnimal
{
    public Mammals(String name, int year)
    {
        super(name,year);
        // id=id+1;
        // this.id=id;
    }

    @Override
    public String breath()
    {
       return  "Lungs";
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }

    @Override
	public String toString()
	{
        // '\'' + ",id = " + id
       return "\nMammals{" +
                "name = '" + name + '\'' +
                ", year = " + year  +
                '}';
	}
}