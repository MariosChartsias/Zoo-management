package Birds.European_Starling;
import Birds.IEatBirds;
import Birds.Birds;


public final class European_Starling extends Birds implements IEatBirds {
    final private static String code= Birds.code+"7"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="2.5 years",weight="80 g";

    public European_Starling(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("European Starling");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
