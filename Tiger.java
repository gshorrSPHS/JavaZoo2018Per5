public class Tiger extends Animal implements Swimming, Running
{
    
    public Tiger(String name, String description)
    {
        super("Tiger", "(you probably know what a tiger is)");
    }
    
    @Override
    public String play()
    {
        return "I";
    }
    
    @Override
    public String eat()
    {
        return "It eats a porg";
    }
    
    @Override
    public String makeNoise()
    {
        return "roar";
    }
    
    @Override
    public String swim()
    {
        return "It actally swims, and then teases all other cats";
    }
    
    @Override
    public String run()
    {
        return "It runs to the edge of its ever-shrinking habitat";
    }   
}
