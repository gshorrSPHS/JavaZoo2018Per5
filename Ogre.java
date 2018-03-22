public class Ogre extends Animal implements Running
{
    private String color;
    private int weight;
    
    public Ogre(String color, int weight)
    {
        super("Ogre", "A man-eating giant.");
        this.color = color;
        this.weight = weight;
    }
    
    public Ogre(String name, String description, String color, int weight)
    {
        super(name, description);
        this.color = color;
        this.weight = weight;
    }
    
    @Override
    public String makeNoise()
    {
        return "It says 'Arrrrgh, I'm going to eat you!'";
    }
    
    @Override
    public String eat()
    {
        return "It devours human flesh ravenously.";
    }
    
    @Override
    public String play()
    {
        return "The ogre runs around wildly, swinging its heavy axe.";
    }
    
    public String run()
    {
        return "The " + color + ", " + weight + "-lb ogre runs, thumping the floor with every step.";
    }
}