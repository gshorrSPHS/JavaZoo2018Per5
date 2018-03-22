
public class SnowLeopard extends Animal implements Running, Swimming
{
    public SnowLeopard(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "The snow leopard runs through the snow chasing its friends.";
    }
    @Override
    public String eat()
    {
        return "It goes out to hunt and eats its findings.";
    }
    @Override
    public String makeNoise()
    {
        return "Chuff chuff chuff";
    }
    @Override
    public String swim()
    {
        return "It majestically strides through the water."; 
    }
    @Override
    public String run()
    {
        return "It flies through the air, speeding through the snow.";
    }
}
