public class ChristmasBaron extends BaronNashor implements Flying
{


    public ChristmasBaron(){
    
        super("Christmas Baron", "This jolly cousin of the Baron Nashor loves to give gifts to the children of Summoners Rift!");
        
        
        
    }
    
     
    @Override
    public String play(){
    
        return "The Christmas Baron reaches deep into the void and pulls out some \n" +
                "presents to play with! He hands the presents out and everyone opens \n" +
                "them at the same time. Everyone's gift was the same...they were lesser void beasts! \n" +
                "The void beasts jumped on people's faces and started taking over their bodies! Ho Ho Ho!";
        
    }

    @Override
    public String makeNoise(){
    
        return "HO HO HO! " + super.makeNoise();
        
    }
    
    @Override
    public String fly(){
    
        return "The Christmas Baron bursts out of his cage, calls forth his Void Sleigh and Void Reindeer, and flys away into the night...the void invasion has begun. The world is no longer safe. Ho ho ho!";
        
    }









}