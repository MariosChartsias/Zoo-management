package Amphibians.Toads;
import Amphibians.IEatAmphibians;
import Reptiles.Reptiles;


public final class Toads extends Reptiles implements IEatAmphibians {
    final private static String code= Reptiles.code+"2"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="10 years",weight="20 g";

    public Toads(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatAmphibians.Eat("Toads");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
