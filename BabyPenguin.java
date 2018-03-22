
/**
 * Write a description of class BabyPenguin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class BabyPenguin extends Penguin
{
    public BabyPenguin()
    {
        super(10, "Baby Penguin", "It's actually a bundle of white feathers \n" +
        "with a layer of blubber");
    }
    
    @Override
    public String makeNoise()
    {
        return "Peep Peep. Where is mommy?";
    }
    
    @Override
    public String eat()
    {
        return "It eats krill and squids";
    }
    
    @Override
    public String play()
    {
        return "I roll in the snow and fall on my head, looking for mommy.";
    }
    
    @Override 
    public String swim()
    {
        return "I can't swim. My legs aren't long enough.";
    }
    
    @Override
    public String run()
    {
        return "I run as quickly as I can, but I can never catch up to my older \n" +
        "brothers.";
    }
    
    @Override
    public String fly()
    {
        return "I cannot fly.";
    }
    
}
