
public class Narwhal extends Animal implements Swimming
{
    private int age;
    private int horn;

    public Narwhal(int horn)
    {
        super("Pet Narwhal", "This is a fat sea dog with a unicorn horn.");
        age = 0;
        horn = 0;
    }
    
    public Narwhal(String name, String description)
    {
        super(name, description);
    }
    
    public int getAge()
    {
        return age;
    }
    
    @Override
    public String play()
    {
        return "You throw it a bone. You idiot. Just because it's a sea dog /n" + 
        "doesn't mean it enjoys chewing on bones like your Pomeranian /n" + 
        "at home.";
        
    }
    
    @Override
    public String makeNoise()
    {
        return "BBOOEEEUUUUURGGGHHHHHAAAAAAAAAAAARGHHHHHHNGHHHHHHH";
    }
    
    @Override
    public String eat()
    {
        int choice = (int)(Math.random() * 3);
        if(choice == 0)
        {
            return "The narwhal leaves you in order to find some food." + 
            "/n" + 
            "/n" + 
            "Unfortunately, it never returns.";
        }
        else if(choice == 1)
        {
            return "The narwhal waits patiently, and the boat you came here /n" +
            "with throws a giant sack of fish in the water." +
            "/n" +
            "/n" + 
            "You have done a good thing today. You fed a unicorn sea dog.";
        }
        else
        {
            return "The narwhal swallows you whole. Making a pet of wild animals /n" +
            "was a bad idea.";
        }
    }
    
    @Override
    public String swim()
    {
        return "nyoom nyoom there the sea dog goes";
    }
}

