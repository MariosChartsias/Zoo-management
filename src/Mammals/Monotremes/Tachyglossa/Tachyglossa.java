package Mammals.Monotremes.Tachyglossa;
import Mammals.Monotremes.Monotremes;
import Mammals.IEatMammals;

public final class Tachyglossa extends Monotremes implements IEatMammals {
    final private static String code= Monotremes.code+"2"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="16.7 years",weight="3.5 kg";

    public Tachyglossa(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }

    public static void Eat(){ IEatMammals.Eat("Tachyglossa");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}