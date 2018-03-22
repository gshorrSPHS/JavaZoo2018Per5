public class MimicOctopus extends Octopus
{
    public MimicOctopus()
    {
        super("Mimic Octopus", "An octopus that can shapeshift. We are screwed.");
    }
    @Override 
    public String play()
    {
        String randomAnimal;
        if(Math.random()< .5)
        {
          randomAnimal = "a poisonous flatfish";
        }
        else
        {
          randomAnimal = "a lion fish";  
        }
        return super.play()+"Now the mimic octopus mimics " + randomAnimal + ".";
    }
    @Override
    public String makeNoise()
    {
        String randomAnimal;
        if(Math.random()< .5)
        {
          randomAnimal = "deadly sea snake";
        }
        else
        {
          randomAnimal = "upright perportuane";  
        }
        return "The octopus mimics the noise of the "+ randomAnimal+ ".";
    }
}