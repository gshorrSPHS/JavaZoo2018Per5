
/**
 * Write a description of class JellyFish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JellyFish extends Animal implements Swimming
{
    private int toxicity;
    /**
     * Constructor for objects of class JellyFish
     */
    public JellyFish(String name, String description, int toxicity)
    {
        super(name,description);
        this.toxicity = toxicity;
    }
    
    @Override
    public String swim()
    {
        return "Jellyfish is swimming..";
    }

    @Override
    public String makeNoise()
    {
        return "Jellyfish doesn't make sound";
    }
    
    @Override
    public String eat()
    {
        return "Jellyfish eats everything";
    }
    
    @Override
    public String play()
    {
        return "Spark Spark!";
    }
}
