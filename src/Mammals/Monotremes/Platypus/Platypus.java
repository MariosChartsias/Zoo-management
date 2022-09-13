package Mammals.Monotremes.Platypus;
import Mammals.Monotremes.Monotremes;
import Mammals.IEatMammals;
public final class Platypus extends Monotremes implements IEatMammals {
    final private static String code= Monotremes.code+"1"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="17 years",weight="1.4 kg"; //average living years of Platypus + average weight of Platypus

    public Platypus(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Platypus");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
