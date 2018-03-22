public class Orca extends Animal implements Swimming 
{
    private int coolness;
    
    public Orca()
    {
        super("Orca" ,"A majestic and intelligent whale that is black with/n"+
              "white patterns on it."); 
    }
    public Orca(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "The orca breaches out of the water and does a backflip";
    }
    @Override
    public String eat()
    {
        return "The orca chomps down on the large fishes in its tank";
    }
    @Override
    public String makeNoise()
    {
        return "The whale makes a high pitched whistling sound";
    }
    @Override
    public String swim()
    {
        return "The orca glides through the water with its fin sticking \n" + 
               "out of the water";
            }
        }
        
            
           
    
   
