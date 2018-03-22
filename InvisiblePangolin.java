public class InvisiblePangolin extends Pangolin implements Running
{
    public InvisiblePangolin()
    {
        super("Invisible Pangolin","It looks really cool I think");
    }
    @Override
    public String play()
    {
        return "You feel a light nudge at your leg, but there's nothing there.";
    }
    @Override
    public String makeNoise()
    {
        return "Something starts to cry, but there's nothing there.";
    }
    @Override
    public String eat()
    {
        return "A floating bowl of ramen appears, and something slurps it down.";
    }
    @Override
    public String run()
    {
        return "Something does nothing.";
    }
}