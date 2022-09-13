package Mammals.Placentals.Hoofed;
import Mammals.IEatMammals;
import Mammals.Placentals.Placentals;

public final class Hoofed extends Placentals implements IEatMammals {
    final private static String code= Placentals.code+"3"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="25 years",weight="300 kg";

    public Hoofed(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Hoofed");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
