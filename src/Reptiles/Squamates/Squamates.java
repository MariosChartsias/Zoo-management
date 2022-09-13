package Reptiles.Squamates;
import Reptiles.IEatReptiles;
import Reptiles.Reptiles;


public final class Squamates extends Reptiles implements IEatReptiles {
    final private static String code= Reptiles.code+"1"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="15 years",weight="1.5 kg";

    public Squamates(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatReptiles.Eat("Squamates");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
