public final class DepressedMadao extends Madao
{
    public DepressedMadao()
    {
        super(30, "Magic Madao", "It sits in the corner, quietly contemplating \n" +
                                 "its failures in life");   
    }
    
    @Override
    public String makeNoise()
    {
        return "*barfs beer*";
    }
    
    @Override
    public String fly(){
        return "*jumps*";
    }
    
    public String observe(){
        return "sees a " + levelOfFailure + " story building";
    }
}