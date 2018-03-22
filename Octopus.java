public class Octopus extends Animal implements Swimming
{
    public Octopus()
    {
        super("Octopus", "One of the smartest animals in the world \n"+
              "which will rise from the sea and overthrow democracy");
    }
    public Octopus(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "The octopus plays with the dead carcasses of it's last meal, \n" +
                "then solves a rubiks cube.";
    }
    @Override
    public String eat()
    {
        return "The octopus eats a crab, then scoffs at you.";
    }
    @Override
    public String makeNoise()
    {
        return "The octopus whispers its plan to inevitably take over the world";
    }
    @Override
    public String swim()
    {
        return "It swims at 25 miles per hour. ";
    }
    
}