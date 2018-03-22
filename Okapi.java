public class Okapi extends Animal implements Running
{
    
    int numStripes;
    
    public Okapi(int numStripes)
    {
        super("Okapi", "The okapi also known as the forest giraffe \n" +
        "or zebra giraffe, is an artiodactyl mammal native to the northeast \n" +
        "of the Democratic Republic of the Congo in Central Africa.");
        
        this.numStripes = numStripes;
    }
    
    
    
    
    @Override
    public String play(){
        return "The okapi plays with a ball";
    }

    @Override
    public String eat(){
        return "The okapi happily eats the grass";
    }

    @Override
    public String makeNoise(){
        return "The okapi happily eats the grass";

    }
    @Override
    public String run(){
        return "*gallop* *gallop*";

    }
    public int getStripes(){
        return numStripes;
    }
    public void earnYourStripes(){
        numStripes++;
    }
}