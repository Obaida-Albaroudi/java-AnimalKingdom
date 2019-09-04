package animals;

public class Birds extends AbstractAnimal
{
    public Birds(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String breath()
    {
       return  "Lungs";
    }

    @Override
    public String move()
    {
        return "Fly";
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
       return "\nBirds{" +
                "name = '" + name + '\'' +
                ", year = " + year  +
                '}';
	}
}
