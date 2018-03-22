public class FlyingOrca extends Orca implements Flying
{
    public FlyingOrca()
    {
        super("Flying Orca", "The Orca doesn't have wings, but it can now \n" +
               "swim through the air");
            }
    @Override
    public String play()
    {
        return "The flying orca does corkscrews in the air and flies \n" +
               "through clouds";
            }
    @Override
    public String fly()
    {
        return "The flying orca glides through the air majestically";
        }
    }
        
    
        
        
    