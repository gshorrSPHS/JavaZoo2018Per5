//we don't want to be able to instantiate Animal
//It's a concept more than a concrete thing.
//we make it an ABSTRACT class
public abstract class Animal
{
    private String name, description;
    
    public Animal(String name, String description)
    {
        this.name = name;
        this.description = description;
    }
    //All animals getName & getDescription in the same way
    //so those methods can be defined--don't need to be abstract
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
    //since Animals makeNoise, eat, and play differently,
    //we make these abstract so the subclass is forced to 
    //override the methods and define how they do those actions
    //themselves
    public abstract String makeNoise();
    public abstract String eat();
    public abstract String play();
}