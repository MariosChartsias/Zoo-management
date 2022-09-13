package Mammals.Marsupials.Kangaroos;
import Mammals.Marsupials.Marsupials;
import Mammals.IEatMammals;
public final class Kangaroos extends Marsupials implements IEatMammals {
    final private static String code= Marsupials.code+"3"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="20 years",weight="50 kg";

    public Kangaroos(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Kangaroos");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
