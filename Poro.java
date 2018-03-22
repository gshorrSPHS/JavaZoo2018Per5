public class Poro extends Animal implements Swimming, Running
{
    public Poro()
    {
        super("Poro", "The Magical creature of the Freljord.");
    }
    
    public Poro(String name, String desc)
    {
        super(name, desc);
    }
    
    @Override
    public String play()
    {
        return "The poro is thrown like a snowball.";
    }
    
    @Override
    public String eat()
    {
        return "Braum feeds it some biscuits.";
    }
    
    @Override
    public String makeNoise()
    {
        return "The poro purrs.";
    }
    
    @Override
    public String swim()
    {
        return "It rolls around in the snowy plains.";
    }
    
    @Override
    public String run()
    {
        return "It runs and rides on Braum's shoulders \n" +
               "instead.";
    }   
}