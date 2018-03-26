public class PetRock extends Animal implements Flying,Swimming
{
    private int weight;
    public PetRock(int weight)
    {
        super("Pet Rock","This is a rock");
        this.weight = weight;
    }

    public PetRock(String name,String des,int weight)
    {
        super(name,des);
        this.weight = weight;
    }

    @Override
    public String play(){
        return "The rock stares with intent";
    }

    @Override
    public String makeNoise(){
        if(weight<0)
        {return "*whoooossssh*, Why is the rock flying?";}
        else if(50>weight && weight>=0)
        {return "*tap*, ops it fell";}
        else if(150>weight && weight>=50)
        {return "*crash*, ops it fell";}
        else if(weight>=1000 && weight>=150)
        {return "*BOOM*, whoa it fell and crack the floor";}
        else 
            return "*Ka Boo*, OMG THE ROCK IS DESTROYING THE EARTH";
    }

    @Override
    public String eat(){
        return "Pet rock cannot eat";
    }

    public String fly(){
        if(weight<0)
        {return "Pet rock was releaced and it flew in to the atmosphere";}
        if(weight>=1000)
        {return "Pet rock will not move";}
        return "Pet rock is hurdled " + Math.round((weight+1) / 3.8) + " ft into the sky";
    }
    
    public String swim(){
        if(weight<0)
        {return "Pet Rock rises from the water and aims for the sky";}
        if(weight>=1000)
        {return "Pet rock sinks at an alarming rate";}
        return "Pet rock is sinks " + Math.round((weight+1) * 0.4) + " ft per second";
    }
}
