public class Porg extends Animal implements Running, Swimming
{
    private String homeWorld, habitat;
    public Porg(String home, String habitat)
    {
        super("Porg", "Porgs were a species of sea-dwelling birds");
        this.homeWorld = home;
        this.habitat = habitat;
        
    }
    public String getWorld()
    {
        return homeWorld;
    }
    public String getHabitat()
    {
        return habitat;
    }
        @Override
    public String play()
    {
        return "Porgs are hyper-curious, cliff-dwelling creatures,\n" +
                "who tend to like shiny human objects to play with";
    }
    @Override
    public String eat()
    {
        return "They eat fish or crustacians";
    }
    @Override
    public String makeNoise()
    {
        return "They make a squaking type noise";
    }
    
    @Override
    public String swim()
    {
        return "They were capable of performing controlled dives into the sea";
    }
    @Override
    public String run()
    {
        return "they waddle in groups called murders";
    }   
}
