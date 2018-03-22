
public final class SPHStiger extends Tiger
{
    public SPHStiger(String name, String description)
    {
        super("SPHS Tiger", "(you prabably are one)");   
    }
    
    @Override
    public String play()
    {
        return "It decides to study instead of play.";
    }
    
    @Override
    public String eat()
    {
        return "It eats a pizza bagel.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Late start!?!; COLOR DAY; Boba!?!; Blaze Pizza Fundraizer; \n"
               + "Gooooooodmoring SPHS...";
    }
    
    @Override
    public String swim()
    {
        return "It swims faster than the Titans";
    }
    
    @Override
    public String run()
    {
        return "It runs to the league title.";
    }  

}


