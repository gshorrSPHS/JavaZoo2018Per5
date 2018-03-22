
/**
 * Write a description of class BoxJellyFish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class BoxJellyFish extends JellyFish
{
    /**
     * Constructor for objects of class BoxJellyFish
     */
    public BoxJellyFish()
    {
        super("Box Jellyfish","Most venomous animal", 99);
    }

    @Override
    public String eat()
    {
        int n =(int)(Math.random()*5);
        if(n==0)
        {
            return "Box Jellyfish eats fish.";
        }
        else if(n==1)
        {
            return "Box Jellyfish eats plankton.";
        }
        else if(n==2)
        {
            return "Box Jellyfish eats crustaceans.";
        }
        else if(n==3)
        {
            return "Box Jellyfish eats the larvae of other species of jellyfish.";
        }
        else
        {
            return "Box Jellyfish eats fish eggs.";
        }
    }
}
