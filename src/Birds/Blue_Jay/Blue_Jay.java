package Birds.Blue_Jay;
import Birds.IEatBirds;
import Birds.Birds;


public final class Blue_Jay extends Birds implements IEatBirds {
    final private static String code= Birds.code+"4"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="7 years",weight="80 g";

    public Blue_Jay(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("Blue Jay");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
