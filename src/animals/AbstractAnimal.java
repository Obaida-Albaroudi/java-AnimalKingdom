package animals;

public abstract class AbstractAnimal
{
    private static int count = 0;
    protected int id=0;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year)
    {
        id = count++;
        this.name = name;
        this.year = year;
    }

    public abstract String breath();
    public abstract String move();
    public abstract String reproduce();

    public String consume(String a)
    {
        return "We ate" + a;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public int getId()
    {
        return id;
    }

    

}