package Mammals.Placentals.Primates;
import Mammals.IEatMammals;
import Mammals.Placentals.Placentals;

public final class Primates extends Placentals implements IEatMammals {
    final private static String code= Placentals.code+"1"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="40 years",weight="25 kg";

    public Primates(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Primates");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
