public class Velociraptor extends Dinosaur implements Running
{
    private int smarts, weight, height;
    private boolean wantsFood;
    
    public Velociraptor(int smarts, int weight, int height, String name, String desc, boolean wantsFood)
    {
        super(name, desc);
        this.smarts = smarts;
        this.weight = weight;
        this.height = height;
        this.wantsFood = wantsFood;
    }
    public Velociraptor()
    {
        super("NotBlue", "Fast");
        this.smarts = 150;
        this.weight = 100;
        this.height = 7;
        this.wantsFood = true;
    }
    @Override
    public String makeNoise()
    {
        return "ERRRRHHRHRHRHRHRHRH";
    }
    @Override
    public String play()
    {
        return "The Velociraptor takes the ball and calls his pack over. " + 
        "\nWith the entire pack of Velociraptors, they proceed to tear the ball apart";
    }
    @Override
    public String eat()
    {
        wantsFood = false;
        return "Many pigs are dropped into the cage.  The raptors tear them apart and eat";
    }
    @Override
    public String run()
    {
        if (wantsFood == true)
        {
            return trickery();
        }
        
        return "The raptors all run around the cage to get excercise." + 
               "\nThey seem to be moving REALLLLY fast" ;
    }
    public String trickery()
    {
        return "Angry that you won't feed them, the raptors refuse to run\n" + 
                "They make a stepstool by standing on top of each other and escape." + 
                "\nI bet you know whats about to happen...\n" + 
               "The raptors escape their cage and run around eating people ... good times";
    }
    public String train()
    {
        return "You attempt to train all the raptors and now you have an army of trained raptors!";
    }
}
