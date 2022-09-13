package Amphibians.Newts;
import Amphibians.IEatAmphibians;
import Reptiles.Reptiles;


public final class Newts extends Reptiles implements IEatAmphibians {
    final private static String code= Reptiles.code+"4"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="12 years",weight="20 g";

    public Newts(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatAmphibians.Eat("Newts");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
