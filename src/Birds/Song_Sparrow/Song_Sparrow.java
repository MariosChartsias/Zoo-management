package Birds.Song_Sparrow;
import Birds.IEatBirds;
import Birds.Birds;


public final class Song_Sparrow extends Birds implements IEatBirds {
    final private static String code= Birds.code+"5"; //Characteristic of this class that cannot change
    private String unicode; //This is the unique code of instantiation
    private String name;
    private final static String age="11 years",weight="19 g";

    public Song_Sparrow(String name,int unicode) {
        this.name=name;
        this.unicode = code+String.valueOf(unicode);
    }
    public static void Eat(){ IEatBirds.Eat("Song Sparrow");}
    public String toString() {
        return "unicode:"+unicode + ", name:" + name + ", age:" + age + ", weight:" + weight;
    }

}
