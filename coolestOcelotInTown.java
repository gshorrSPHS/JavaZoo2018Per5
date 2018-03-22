public final class coolestOcelotInTown extends Ocelot
{
    public coolestOcelotInTown()
    {
        super(10, "Coolest Ocelot in Town", "So cool he makes ice cubes jealous.");
    }
    
    @Override
    public String makeNoise()
    {
       return "He puts on some sunglasses and says: " + super.makeNoise();
    }
} 