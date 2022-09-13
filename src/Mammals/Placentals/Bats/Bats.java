package Mammals.Placentals.Bats;
import Mammals.IEatMammals;
import Mammals.Placentals.Placentals;

public final class Bats extends Placentals implements IEatMammals {
    final private static String code= Placentals.code+"5"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="20 years",weight="1 kg";

    public Bats(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatMammals.Eat("Bats");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
