public class DragonBaron extends BaronNashor implements Flying
{

     public DragonBaron(){
    
    
        super("Dragon Baron", "Wait a minute, this isn't a Baron Nashor at all! It's just a dragon! Oh well!");
        
        
    }
    
    @Override
    public String fly(){
        
        return "The Dragon spreads it's wings and flys around in it's cage. This isn't a Baron Nashor! It's a dragon! Looks like someone is getting fired!";
        
    }
    
  }