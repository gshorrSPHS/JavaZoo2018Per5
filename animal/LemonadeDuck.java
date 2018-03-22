/**
 * Write a description of class MagicPinkFairyArmadillo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class LemonadeDuck extends Duck
{
    public LemonadeDuck()
    {
       super(10, "Lemonade duck",
           "The duck went to the lemonade stand"); 
    }
    
    @Override
    public String makeNoise()
    {
       return "Hey, got any grapes?" + super.makeNoise();   
    }
}