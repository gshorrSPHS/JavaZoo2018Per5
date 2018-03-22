public final class GreenOgre extends Ogre
{
    public GreenOgre()
    {
        super("Shrek", "A waffle-eating giant.", "Green", 450);
    }
    
    @Override
    public String makeNoise()
    {
        return "It says 'I'm making waffles!'";
    }
    
    @Override
    public String eat()
    {
        return "It eats some crispy Belgian waffles drenched in syrup.";
    }
}