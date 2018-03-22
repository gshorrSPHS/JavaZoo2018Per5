
/**
 * Write a description of class Penguin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Penguin extends Animal implements Swimming, Running, Flying
{
    private int cuteness;
    
    public Penguin (int cuteness)
    {
        super("Penguin", "An aquatic flightless bird.");
        this.cuteness=cuteness;
        
    }
    
    public Penguin(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String makeNoise()
    {
        return "It says Noot Noot " + cuteness + " times.";
    }
    
    @Override 
    public String eat()
    {
        return "It eats seafood from fish and squid to krill and custaceans. ";
    }
    
    @Override
    public String play()
    {
        return "The penguins waddles around the ice bergs in a group.";
    }
    
    @Override
    public String swim()
    {
        return "It swims in a vat of freezing ice water.";
    }
    
    @Override
    public String run()
    {
        return "It runs as quickly as its little legs can carry it, \n" +
        "trailing across patches of ice.";
    }
    
    @Override
    public String fly()
    {
        return "I cannot fly";
    }
}
