package Reptiles.Rhynchocephalians;
import Reptiles.IEatReptiles;
import Reptiles.Reptiles;


public final class Rhynchocephalians extends Reptiles implements IEatReptiles {
    final private static String code= Reptiles.code+"4"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="14 years",weight="1 kg";

    public Rhynchocephalians(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatReptiles.Eat("Rhynchocephalians");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
