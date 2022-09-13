package Mammals.Placentals.Whales;
import Mammals.IEatMammals;
import Mammals.Placentals.Placentals;

public final class Whales extends Placentals implements IEatMammals {
    final private static String code= Placentals.code+"8"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="45 years",weight="3-15 ton";

    public Whales(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Whales");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
