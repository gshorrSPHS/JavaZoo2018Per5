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
public String play()
{
    return "The goat breaks everyone's ankles.";
}

@Override
public String makeNoise()
{
    return "YOU CAN'T GUARD ME!";
}

@Override
public String eat()
{
    return "The goat devours his steak";
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