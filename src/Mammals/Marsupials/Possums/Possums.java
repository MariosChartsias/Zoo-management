package Mammals.Marsupials.Possums;
import Mammals.Marsupials.Marsupials;
import Mammals.IEatMammals;
public final class Possums extends Marsupials implements IEatMammals {
    final private static String code= Marsupials.code+"5"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="3 years",weight="4.5 kg";

    public Possums(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Possums");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
