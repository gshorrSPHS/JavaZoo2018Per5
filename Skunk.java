public class Skunk extends Animal implements Swimming, Running
{
    private int smellyness;
    
    public Skunk(int smellyness)
    {
        super("Skunk", "Looked at a threatening human being");
        this.smellyness = smellyness;
    }
    
    public Skunk(int smellyness, String name, String desc)
    {
        super(name, desc);
        this.smellyness = smellyness;
    }
    
    @Override
    public String play()
    {
        return "It jumps into the bush";
    }
    
    @Override
    public String eat()
    {
        return "It eats an insect";
    }
    
    @Override
    public String makeNoise()
    {
        return "It screams from its butt with gas" + smellyness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It bathes in a bath of tomato sauce";
    }
    
    @Override
    public String run()
    {
        return "It's a fart and run!";
    }   
}