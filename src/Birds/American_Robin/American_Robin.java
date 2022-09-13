package Birds.American_Robin;
import Birds.IEatBirds;
import Birds.Birds;


public final class American_Robin extends Birds implements IEatBirds {
    final private static String code= Birds.code+"3"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="2 years",weight="77 g";

    public American_Robin(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("American Robin");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
