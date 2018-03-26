public final class RealPetRock extends PetRock
{
    public RealPetRock(int weight){
        super("Real Pet Rock","This rock is really a pet this time guys!",weight);
    }

    @Override
    public String play(){
        return "The rock talks about his day and this plot to brake out of this\n"+
        "Zoo and destroy all who imprisoned him";
    }

    @Override
    public String makeNoise(){
        return "Hi, my name is Pet rock and I want to be your friend :)";
    }

    @Override
    public String eat(){
        return "The Pet rock feast on the remains of his fallen rock foes";
    }
}
