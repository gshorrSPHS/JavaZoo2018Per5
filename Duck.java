public class Duck extends Animal implements Running, Swimming
{
    private int cuteness;
    
    public Duck(int cuteness)
    {
        //super comes first in the constructor
        super("Duck", 
              "A yellow furball with eyes and orange beak and feet");
        this.cuteness = cuteness;    
    }
    
    public Duck(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "This duck likes to waddle";
    }
      
    @Override
    public String eat()
    {
        return "It eats grapes";
    }
 
    @Override
    public String makeNoise()
    {
        return "It says got any grapes" + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It swims in a lemonade pond";
    }
    
    @Override
    public String run()
    {
        return "It runs as quickly as it can waddle away\n" +
               "from the lemonade stand 'till the very next day.";
    }
     
}