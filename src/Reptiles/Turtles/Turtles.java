package Reptiles.Turtles;
import Reptiles.IEatReptiles;
import Reptiles.Reptiles;


public final class Turtles extends Reptiles implements IEatReptiles {
    final private static String code= Reptiles.code+"2"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="10-80 years",weight="50 kg";

    public Turtles(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatReptiles.Eat("Turtles");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
