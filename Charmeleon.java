public final class Charmeleon extends Charmander
{
    public Charmeleon()
    {
        super(16, "Charmeleon", "Charmander is now Charmeleon!");   
    }
    
    @Override
    public String makeNoise()
    {
        return "Char! Meleon!";
    }
    
    @Override
    public String play()
    {
        return "Charmeleon uses flamethrower.";
    }
    
    @Override
    public String fly()
    {
        return "Charmeleon can't fly... yet.";
    }
}