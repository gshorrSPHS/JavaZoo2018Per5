public class Madao extends Animal implements Swimming, Running, Flying
{
    public int levelOfFailure;
    
    public Madao(int levelOfFailure){
        super("MADAO", "A useless abomination depleting natural resources \n" +
                       "from the Earth and its parents.");
        this.levelOfFailure = levelOfFailure;
    }
    
    public Madao(int levelOfFailure, String name, String desc){
        super(name, desc);
        this.levelOfFailure = levelOfFailure;
    }
    
    @Override
    public String play(){
        return "*furiously keyboardwarriors*";
    }
    
    @Override
    public String makeNoise(){
        return "R E E E E E E E";
    }
    
    @Override
    public String eat(){
        return "*screams for more beer*";
    }
    
    @Override
    public String swim()
    {
        return "*drowns pitifully*";
    }
    
    @Override
    public String run()
    {
        return "*screams as it trips, out of breath*";
    }   
    
    @Override
    public String fly(){
        return "I believe.";
    }
    
    public String think(){
        return "I've failed to a level of " + levelOfFailure + " in this miserable life.";
    }
}
