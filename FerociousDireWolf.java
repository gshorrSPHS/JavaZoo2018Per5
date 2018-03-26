public final class FerociousDireWolf extends DireWolf
{
    public FerociousDireWolf()
    {
        super(10, "Ferocious Dire Wolf", "Protects the zoo with vigilance and mercy.");   
    }
    
    @Override
    public String makeNoise()
    {
        return "YOU SHALL NOT PASS" + "NEVER";
    }
    
    @Override
    public String run()
    {
        return "As its paws glide through the soil, \n" +
                "piles of dirt are left in its wake"; 
    }
    
    @Override
    public String eat()
    {
        return "'Ah yes!', said the Dire Wolf, 'these \n" +
                "mangos and peaches are scrumptious!"; 
    }
}