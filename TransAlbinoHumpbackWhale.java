public class TransAlbinoHumpbackWhale extends AlbinoHumpbackWhale implements Flying,
Running, Swimming
{
    public TransAlbinoHumpbackWhale()
    {
        super(10,"Trans Albino Humpback Whale", "Majestic.");
    }
    public String fly()
    {
        return "It flys in the sky at 30mph";
    }
    public String run()
    {
        return "It runs for as long as it can stay out of water";
    }
        public String swim()
    {
        return "It can swim just like the AHB";
    }
}