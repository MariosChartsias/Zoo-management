package Reptiles.Crocodilians;
import Reptiles.IEatReptiles;
import Reptiles.Reptiles;


public final class Crocodilians extends Reptiles implements IEatReptiles {
    final private static String code= Reptiles.code+"3"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="70 years",weight="250 kg";

    public Crocodilians(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatReptiles.Eat("Crocodilians");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
