package Birds.Red_Winged_Blackbird;
import Birds.IEatBirds;
import Birds.Birds;


public final class Red_Winged_Blackbird extends Birds implements IEatBirds {
    final private static String code= Birds.code+"6"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="2 years",weight="60 g";

    public Red_Winged_Blackbird(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("Red-Winged Blackbirds");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
