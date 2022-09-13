package Birds.Nothern_Cardinal;
import Birds.IEatBirds;
import Birds.Birds;


public final class Nothern_Carnidal extends Birds implements IEatBirds {
    final private static String code= Birds.code+"2"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="3 years",weight="43 g";

    public Nothern_Carnidal(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("Nothern Carnidal");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
