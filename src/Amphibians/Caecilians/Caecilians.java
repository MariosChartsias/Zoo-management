package Amphibians.Caecilians;
import Amphibians.IEatAmphibians;
import Reptiles.Reptiles;


public final class Caecilians extends Reptiles implements IEatAmphibians {
    final private static String code= Reptiles.code+"5"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="5 years",weight="25 g";

    public Caecilians(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatAmphibians.Eat("Caecilians");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
