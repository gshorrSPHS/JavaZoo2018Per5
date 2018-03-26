public class LaserKraken extends Kraken implements Flying, Running, Swimming
{
    public LaserKraken(String name, String desc)
    {
      super("LaserKraken", "A laser Kraken that is oddly a lot friendly then the original"); 
     }
    @Override
    public String play() 
    {
     return "Laser Kraken smiles :D and its for real this time!! + \n" +
             "The Laser Kraken gently plays with a teddy bear you brought for him" ;
    }                
    @Override 
    public String makeNoise()
    {
        return "Laser Kraken blups LOUDLY";
    }
    @Override 
    public String swim()
    {
        return "Laser Kraken goes suppa fast like I can't see where he went"; 
    }  
    @Override 
    public String fly()
    {
        return "He goes out and flies" + "\n" + "wait..it flies" + "PEOPLE IT FLIES";
    }    
    @Override 
    public String run()
    {
      return "it doesn't" + "I mean it can";    
    }   
}    