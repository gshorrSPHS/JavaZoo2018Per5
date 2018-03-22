public class Goat extends Animal implements Swimming, Running
{
    private int greatness;
    
    public Goat(int greatness)
    {
        super("Goat", "Greatest of all time.");
        this.greatness = greatness;
    
}

public Goat(int greatness, String name, String desc)
{
    super(name, desc);
    this.greatness = greatness;
}

@Override
public String BallUp()
{
    return "The goat breaks everyone's ankles.";
}

@Override
public String Yell()
{
    return "YOU CAN'T GUARD ME!";
}

@Override
public String Rings()
{
    return "The goat has " + greatness + " championship rings";
}

@Override
public String swim()
{
    return "The goat swims to train.";
}

@Override
public String run()
{
    return "The goat runs up and down the court.";
}
}