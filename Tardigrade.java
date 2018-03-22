public class Tardigrade extends Animal implements Running, Swimming {

    public Tardigrade(String name, String desc) {
        super(name, desc);
    }

    public Tardigrade() {
        super("Joe", "Joe has lived 200 years. He has seen unimaginable horrors and" +
                " is no longer fazed by anything he sees. He enjoys reading in his free time.");
    }

    @Override
    public String makeNoise() {
        return "... You can't hear " + getName() + ".";
    }

    @Override
    public String eat() {
        return getName() + " proceeds to extend its snout and suck on the food item.";
    }

    @Override
    public String play() {
        return getName() + " lives forever. He has transcended playing.";
    }

    @Override
    public String run() {
        return getName() + " moves all of its eight legs in a mad fury and moves a fraction of a millimeter.";
    }

    @Override
    public String swim() {
        return getName() + " uses its eight legs to wade through the water quickly.";
    }
}

