public class PinkFairyArmadillo extends Animal implements Swimming, Running
{
    private int cuteness;
    
    public PinkFairyArmadillo(int cuteness)
    {
        super("Pink Fairy Armadillo", "A tiny sashimi with legs.");
        this.cuteness = cuteness;
    }
    
    public PinkFairyArmadillo(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The armadillo frolics around in a bowl of wasabi.";
    }
    
    @Override
    public String eat()
    {
        return "It eats some sticky rice, and some gets stuck to it.";
    }
    
    @Override
    public String makeNoise()
    {
        return "It says Rheeeeeeeeee " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It bathes in a vat of soy sauce.";
    }
    
    @Override
    public String run()
    {
        return "It runs as quickly as its little legs can carry it, \n" +
               "trailing soy sauce puddles behind.";
    }   
    
    // Math.random() --> [0, 1) ---> 0..0.99999999
    // Math.random() * 3 --> [0, 3) ---> 0..2.99999999
    // int choice =  (int)(Math.random() * 3); // --> 0, 1, 2
}









