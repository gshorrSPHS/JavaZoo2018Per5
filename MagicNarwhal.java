
public final class MagicNarwhal extends Narwhal
{
    private int age;
    private int horn;

    public MagicNarwhal()
    {
        super("Magic Narwhal", "It's a domesticated, slightly less chubby sea dog.");
    }
    
    @Override
    public String play()
    {
        return "It doesn't want to play. The fact that you domesticated it makes it sad.";
        
    }
    
    @Override
    public String makeNoise()
    {
        return "This narwhal is magic and therefore has gained intelligence equivalent /n" + 
        "to that of a 32 year old human." + 
        "/n" + 
        "/n" + 
        "Ah, and I forgot to mention that it doesn't want to make noise. It thinks it rude.";
    }

    
    @Override
    public String swim()
    {
        return "Because it is magic, this narwhal no longer swims. It /n" +
        "pierces through the water with its unicorn horn and jumps out of the water..." +
        "/n" + 
        "/n" + 
        "/n" +
        "And starts to fly.";
    }
}

