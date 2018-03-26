public class Pangolin extends Animal implements Running
{
    private int elasticity;
    public Pangolin(int elasticity)
    {
        super("Pangolin", "A living pine cone");
        this.elasticity = elasticity;
    }
    public Pangolin(String name, String description)
    {
        super("Pangolin", "A living pine cone");
    }
    @Override
    public String play()
    {
        return "The Pangolin waddles over to you, rolls into a ball, + \n" + 
                "and falls asleep in your lap.";
    }
    @Override
    public String makeNoise()
    {
        return "The Pangolin lets out a high pitched squeal and runs around in \n" + 
               "circles.";
    }
    @Override
    public String eat()
    {
        return "The Pangolin pulls a bowl of ramen out of nowhere and slurps it \n" + "happily.";
    }
    @Override
    public String run()
    {
        return "The Pangolin spreads its wings and stands there.";
    }
}