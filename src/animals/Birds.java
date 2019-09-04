package animals;

public class Birds extends AbstractAnimal
{
    public Birds(String name, int year)
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
