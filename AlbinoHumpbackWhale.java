public class AlbinoHumpbackWhale extends Animal implements Swimming

{
    private int cuteness;
    
    public AlbinoHumpbackWhale(int cuteness)
    {
        super("Albino Humpback Whale", "The thickest fish in the sea.");
        this.cuteness = cuteness;
    }
    
    public AlbinoHumpbackWhale(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The Albino Humpback Whale plays Fortnite.";
    }
    
    @Override
    public String eat()
    {
        return "It eats other fish.";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says waaoaoooooooooooaoaoo " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It swims in the ocean where it lives.";
    }  
}