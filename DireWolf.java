public class DireWolf extends Animal implements Swimming, Running
{
    private int strength;
    
    public DireWolf(int strength)
    {
        super("Ferocious Dire Wolf", "A large beast with the heart of a thousand soldiers");
        this.strength = strength;
    }
    
    public DireWolf(int strength, String name, String desc)
    {
        super(name, desc);
        this.strength = strength;
    }
    
    @Override
    public String play()
    {
        return "The Dire Wolf leaps from mountain to /n" + 
                "mountain chasing after bees";
    }
    
    @Override
    public String eat()
    {
        return "With its mighty paws, it climbs the trees /n" + 
                "and feasts on the fruit";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says Ahhhooooooooohhh " + strength + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It trots in the waters and frolics with the seaweed.";
    }
    
    @Override
    public String run()
    {
        return "It gallops through the trees with determination \n" +
               "at the speed of light.";
    }   
}