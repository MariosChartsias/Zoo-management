package Mammals.Marsupials.Antechinus;
import Mammals.Marsupials.Marsupials;
import Mammals.IEatMammals;
public final class Antechinus extends Marsupials implements IEatMammals {
    final private static String code= Marsupials.code+"1"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="11 months",weight="35g";

    public Antechinus(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Antechinus");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
