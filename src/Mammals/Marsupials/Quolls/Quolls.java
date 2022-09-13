package Mammals.Marsupials.Quolls;
import Mammals.Marsupials.Marsupials;
import Mammals.IEatMammals;
public final class Quolls extends Marsupials implements IEatMammals {
    final private static String code= Marsupials.code+"6"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="3 years",weight="2.5 kg";

    public Quolls(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Quolls");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
