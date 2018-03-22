
/**
 * Write a description of class HoneyBadger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HoneyBadger extends Animal implements Swimming,Running,Flying
{
    // instance variables - replace the example below with your own
    private int killstreak;
    private double chuckNorrisFactor;

    
    public HoneyBadger(int killstreak, double chuckNorrisFactor)
    {
        super("Honey Badger", "A solitary creature, "+
        "one may find from its actions that frankly it does not give "+
        "a second thought about matters at hand.");
        this.killstreak = killstreak;
        this.chuckNorrisFactor=chuckNorrisFactor;
    }
    
    public HoneyBadger(String name, String desc, int killstreak, double chuckNorrisFactor)
    {
        super(name, desc);
        this.killstreak = killstreak;
        this.chuckNorrisFactor=chuckNorrisFactor;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String swim()
    {
        return "The Honey Badger swims in water... and on land.";
    }
    @Override
    public String run()
    {
        return "The honey badger";
    }
    @Override
    public String fly()
    {
        return "The badger stands up on its hind legs in an "+
        "attempt to fly. It slowly rises up until it falls.";
    }
    @Override
    public String play()
    {
        return "The honey badger's favourite activity is to watch "+
        "videos of humans on Youtube.";
    }
    @Override
    public String eat()
    {
        return "You cannot tell what the Honey badger to "+
        "eat for it eats anything that moves";
    }
    @Override
    public String makeNoise()
    {
        chuckNorrisFactor=(1+chuckNorrisFactor)*100;
        return "It rapidly chrips and growls at the same time "+
        "generating "+chuckNorrisFactor+" decibels";
    }
}
