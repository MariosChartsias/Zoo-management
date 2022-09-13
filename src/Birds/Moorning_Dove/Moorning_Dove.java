package Birds.Moorning_Dove;
import Birds.IEatBirds;
import Birds.Birds;


public final class Moorning_Dove extends Birds implements IEatBirds {
    final private static String code= Birds.code+"1"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="2 years",weight="120 g";

    public Moorning_Dove(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("Moorning Doves");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
