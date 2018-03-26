public class Kraken extends Animal implements Swimming, Running, Flying
{
    private int cuteness;
    
    public Kraken(int cuteness)
    {
        super("Kraken", "A giant sea monster that eats pretty much anything");
        this.cuteness = cuteness;
    }
    
    public Kraken(String name, String desc)
    {
        super(name, desc); 
    }
    
    
    public Kraken(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The Kraken looks gives a BIG smile :D wait...that's not a smile...AHH";
    }
    
    @Override
    public String eat()
    {
        return "Kraken eats on a few boats then eats a special dessert of pink donuts";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says blub blub " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It swims at incredibly high speeds for the lols";
    }
    
    @Override
    public String run()
    {
        return "It does run..underwater"; 
    }   
    
    @Override
    public String fly()
    {
      return "It does fly...underwater"; 
    }     
}