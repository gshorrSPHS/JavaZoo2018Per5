public class Quagga extends Animal implements Running
{
     public Quagga()
     {
         super("Quagga", "Extinct zebra subspecies.");
     }
     
     public Quagga(String name, String desc)
     {
         super(name, desc);
     }
     
     @Override
     public String makeNoise()
     {
         return "Yip yip";
     }
     
     @Override
     public String play()
     {
         return "Quagga bites his partners back.";
     }
     
     @Override
     public String eat()
     {
         return "Quagga eats some tasteless grass.";
     }
     
     @Override
     public String run()
     {
         return "Quagga runs like a Zebra does.";
     }
}
