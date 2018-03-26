public class Flamingo extends Animal implements Swimming, Running, Flying
{
    private int cuteness;
    
    public Flamingo(int cuteness)
    {
        super("Flamingo", "large birds with long necks and pink/reddish /n" +
        "feathers.");
        this.cuteness = cuteness;
    }
    
    public Flamingo(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The flamingo starts pecking at you violently";
    }
    
    @Override
    public String eat()
    {
        return "flamingo starts chomping bugs";
    }
    
    @Override
    public String makeNoise()
    {
        return "merp mehp merp mehp";
    }
    
    @Override
    public String swim()
    {
        return "It walks in water";
    }
    
    @Override
    public String fly()
    {
        return "Travels 373 miles away from the Zoo";
    }
    
    @Override
    public String run()
    {
        return "It sprints to the nearest shrimp";
    }   
}