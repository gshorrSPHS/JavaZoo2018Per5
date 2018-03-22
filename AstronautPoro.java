public final class AstronautPoro extends Poro
{
    public AstronautPoro()
    {
        super("Astronaut Poro", "Travels the galaxy just beacuse.");   
    }
    
    @Override
    public String makeNoise()
    {
        return "Houston, we have a Poro...";
    }
}