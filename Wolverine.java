public abstract class Wolverine extends Animal implements Running
{
    private int ferocity;
    public Wolverine(int ferocity)
    {
        super("Wolverine", "A ferocious beast.");
        this.ferocity = ferocity;
    }
    public Wolverine(int ferocity, String name, String desc)
    {
        super(name, desc);
        this.ferocity = ferocity;
    }
    public String play()
    {
        return "The wolverine gnashes its teeth intimidatingly";
    }
    public String eat()
    {
        return "The wolverine gnaws at its prey.";
    }
    public String makeNoise()
    {
        return "The wolverine growls loudly.";
    }
    public String swim()
    {
        return "It washes off in a cool pond.";
    }
    public String run()
    {
        return "It runs off, smelling blood.";
    }
}