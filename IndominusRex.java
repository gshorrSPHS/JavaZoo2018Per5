public class IndominusRex extends Dinosaur implements Running
{
    private int smarts, weight, height;
    private boolean wantsFood;
    
    public IndominusRex(int smarts, int weight, int height, String name, String desc, boolean wantsFood)
    {
        super(name, desc);
        this.smarts = smarts;
        this.weight = weight;
        this.height = height;
        this.wantsFood = wantsFood;
    }
    
    public IndominusRex()
    {
        super("Rexy", "Scary");
        this.smarts = 100;
        this.weight = 300;
        this.height = 25;
        this.wantsFood = true;
    }
    
    @Override
    public String makeNoise()
    {
        return "RAAAAAAAAAAAAAAAAAAAWWWWWWWWWRRRRRRRRRRRR";
    }
    @Override
    public String play()
    {
        return "You give the Indominus a ball, and it eats it...";
    }
    @Override
    public String eat()
    {
        wantsFood = false;
        return "A giant peice of cow is dropped into the cage.  The Indominus eats it and disgusts everyone... Except Manav";
    }
    @Override
    public String run()
    {
        if (wantsFood == true)
        {
            return trickery();
        }
        
        return "The Indominus runs around the giant cage until it gets tired, then it wants food.  \nI would give it food if I were you..." ;
    }
    public String trickery()
    {
        return "Angry that you won't feed it the Indominus refuses to run\n" + "The Indominus Rex camouflages into the trees, and disguises it's heat signature." + 
                "\nI bet you know whats about to happen...\n" + 
               "The Indominus Rex escapes it's cage after the zoo foolishly sends people inside the pen and it finds and eats everything, \nthen comes for YOU";
    }
}