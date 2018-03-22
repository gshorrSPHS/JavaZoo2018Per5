public class BaronNashor extends Animal implements Running
{
    private String nameOf;
    public BaronNashor(){
    
        super("The Baron", "This is a big purple monster that's a snake and a tentacle monster that gives you powers when you kill it!");
        
        
        
    }
    public BaronNashor(String name, String desc){
    
        super(name, desc);
        nameOf = name;
        
        
    }
    @Override
    public String play(){
    
        return "The Baron shoots his toxic saliva at you, and some of it gets through \n" +
                "the cage bars, into your popcorn. It completely dissolves the popcorn, the bucket, \n" +
                "and 2 of your fingers. You look at the sign that says 'Don't play with Baron please'. \n" +
                "Read it too late!";
 
    }
    @Override
    public String eat(){
    
        return  nameOf + " shoots his tentacle out between the poorly spaced cage bars, \n" +
                "grabs the person behind you (a zoo worker named Ben), and messily devours him. \n" +
                "Seriously, who decided 2 feet between each bar would be safe?";

    }
    @Override 
    public String makeNoise(){
    
        return "SHREEEEIIIKKKKK";
        
    }
    @Override
    public String run(){
    
        return "The Baron cannot run. The void rift allowing it to peek into this \n" +
                "world is deep underneath the cage. It is possible that what you see is \n" +
                "only, as you say, the tip of the iceberg. At this moment, it could be trying to \n" +
                "figure out how to push the rest of it's body through the rift and lay waste to the \n" +
                "Manav Zoo";
        
    }
    
    
}
