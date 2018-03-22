public class Ocelot extends Animal implements Running, Swimming
{
    private int coolness;
    
    public Ocelot(int coolness)
    {
        super("Ocelot", "A small cat from Central and South America with golden patterned fur.");
        this.coolness = coolness;
    }
    
    public Ocelot(int coolness, String name, String desc)
    {
        super(name, desc);
        this.coolness = coolness;
    }
    
    @Override
    public String play(){
        return "It runs over, swats playfully at you, and then immediately lays down, exposing its\n" +
        "soft underbelly.";
    }
    
    @Override
    public String eat(){
        return "It dives into a nearby river, emerging with a shiny fish.";
    }
    
    @Override
    public String makeNoise(){
        String noise = "";
        for (int i = 0; i <= coolness; i++){
            noise += "rrrwrwrrrRAWRrrwrwrrw";
        }
        return noise;
    }
    
    @Override
    public String run(){
        return "It lithely springs away from you, gracefully covering ground.";
    }
    
    @Override
    public String swim(){
        return "It jumps into a nearby river, tail swishing from side to side like a dappled rudder.";
    }
}
