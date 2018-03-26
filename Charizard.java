public final class Charizard extends Charmander
{
    public Charizard()
    {
        super(36, "Charizard", "Charmeleon is now Charizard!");   
    }
    
    @Override
    public String makeNoise()
    {
        return "Screeech.";
    }
    
    @Override
    public String play()
    {
        return "Charizard uses dragon claw.";
    }
    
    @Override
    public String fly()
    {
        return "The majestic dragon takes flight.";
    }
}