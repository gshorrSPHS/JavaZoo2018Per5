public abstract class Charmander extends Animal implements Running, Flying
{
    private int level;
    
    public Charmander()
    {
        super ("Charmander", "A reptilian Pokemon.");
        this.level = level;
    }
    
    public Charmander(int level, String name, String desc)
    {
        super(name, desc); 
        this.level = level;
    }
    
    @Override
    public String play()
    {
        return "Charmander uses ember.";
    }
    
    @Override
    public String makeNoise()
    {
       return "Charmander! Char! Char!"; 
    }
    
    @Override
    public String eat()
    {
        return "It roasts its prey and consumes it."; 
    }
    
    @Override
    public String run()
    {
        return "It waddles quickly on two legs.";
    }
    
    @Override
    public String fly()
    {
        return "Charmander can't fly... yet.";
    }
}