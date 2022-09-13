import Amphibians.Caecilians.Caecilians;
import Amphibians.Frogs.Frogs;
import Amphibians.Newts.Newts;
import Amphibians.Salamandres.Salamandres;
import Amphibians.Toads.Toads;
import Birds.American_Robin.American_Robin;
import Birds.Blue_Jay.Blue_Jay;
import Birds.European_Starling.European_Starling;
import Birds.Moorning_Dove.Moorning_Dove;
import Birds.Nothern_Cardinal.Nothern_Carnidal;
import Birds.Red_Winged_Blackbird.Red_Winged_Blackbird;
import Birds.Song_Sparrow.Song_Sparrow;
import Mammals.Marsupials.Antechinus.Antechinus;
import Mammals.Marsupials.Gliders.Gliders;
import Mammals.Marsupials.Kangaroos.Kangaroos;
import Mammals.Marsupials.Kangaroos.Opossums;
import Mammals.Marsupials.Possums.Possums;
import Mammals.Marsupials.Quolls.Quolls;
import Mammals.Marsupials.Wombat.Wombat;
import Mammals.Monotremes.Platypus.Platypus;
import Mammals.Monotremes.Tachyglossa.Tachyglossa;
import Mammals.Placentals.Bats.Bats;
import Mammals.Placentals.Bears.Bears;
import Mammals.Placentals.Dolphins.Dolphins;
import Mammals.Placentals.Hoofed.Hoofed;
import Mammals.Placentals.Primates.Primates;
import Mammals.Placentals.Rodents.Rodents;
import Mammals.Placentals.Seals.Seals;
import Mammals.Placentals.Whales.Whales;
import Reptiles.Crocodilians.Crocodilians;
import Reptiles.Rhynchocephalians.Rhynchocephalians;
import Reptiles.Squamates.Squamates;
import Reptiles.Turtles.Turtles;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static int y=1;
    private static int w; //Counts the whole number of animals that have been in zoo park
    public static void main(String[] args) throws IOException{
        while(y!=0){
            int i=0; //using a lot of times for loops
            LinkedList<String> Main = new LinkedList<>(); //Creates a LinkedList Object with name: "Main" of this Main class
            if(new File("Animals.txt").exists()){
                BufferedReader reader=new BufferedReader(new FileReader("Animals.txt"));
                String line=reader.readLine();
                while(line!=null){
                    Main.add(line);
                    line=reader.readLine();
                }
                reader.close();
            }
            Code_Unitialization();

            y=Menu();
            switch (y) {
                case 1:
                    AddAnimal();
                    break;
                case 2:
                    if (Main.isEmpty()) {
                        EmptyMessage();
                    } else {
                        System.out.println(" ___________________________________________");
                        System.out.println(" ");
                        System.out.println("****    List of animals in zoo park:    ****");
                        for (i = 0; i < Main.size(); i++) {
                            System.out.println(Main.get(i));
                        }
                        System.out.println("********************************************");
                    }
                    break;
                case 3:
                    if (Main.isEmpty()) {
                        EmptyMessage();
                    } else {
                        System.out.print("Search for animal(s) with name: ");
                        String name = (new Scanner(System.in)).next();
                        boolean flag = false;
                        int[] positions = new int[Main.size()]; //the max size of this array is when all names of Main list are the same with this one we're trying to find
                        int z = 0;
                        for (i = 0; i < Main.size(); i++) {
                            if (Main.get(i).contains(":"+name+",")) {
                                flag = true;
                                positions[z] = i;
                                z++;
                            }
                        }
                        System.out.println(" ___________________________________________");
                        if (flag) {
                            System.out.println("Results of search:");
                            for (i = 0; i < z; i++) {
                                System.out.print(i + 1 + ". ");
                                System.out.println(Main.get(positions[i]));
                            }
                        } else {
                            System.out.println("No animal found with name:" + name);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Search for animal(s) with unicode: ");
                    String unicode = (new Scanner(System.in)).next();
                    boolean flag = false;
                    int[] positions = new int[1]; // positions array has size: 1 because the code is unique and the object in only one
                    int z = 0;
                    for (i = 0; i < Main.size(); i++) {
                        if (Main.get(i).contains(":"+unicode+",")) {
                            flag = true;
                            positions[z] = i;
                            z++;
                        }
                    }
                    System.out.println(" ___________________________________________");
                    if (flag) {
                        System.out.println("Results of search:");
                        for (i = 0; i < z; i++) {
                            System.out.print(i + 1 + ". ");
                            System.out.println(Main.get(positions[i]));
                        }
                    } else {
                        System.out.println("No animal found with unicode:" + unicode);
                    }
                    break;
                case 5:
                    if (Main.isEmpty()) {
                        EmptyMessage();
                    } else {
                        System.out.print("Delete animal with code: ");
                        unicode = (new Scanner(System.in)).next();
                        flag = false;
                        for (i = 0; i < Main.size(); i++) {
                            if (Main.get(i).contains(":"+unicode+",")) {
                                flag = true;
                                System.out.println("Animal: " + Main.get(i) + " has been removed");
                                Main.remove(i);
                            }
                        }
                        if (!flag) {
                            System.out.println("Our zoo park does not have animal with this code");
                        }else{
                            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Animals.txt", false)));
                            out.println(Main.getFirst());
                            String line;
                            out = new PrintWriter(new BufferedWriter(new FileWriter("Animals.txt", true)));
                            for(i=0; i<Main.size(); i++) {
                                out.println(Main.get(i));
                            }
                            out.close();
                        }
                    }
                    break;
                case 6:
                    AllEat();
                    break;
                case 7:
                    if (Main.isEmpty()) {
                        EmptyMessage();
                    } else {
                        File file =new File("Animals.txt");
                        if(file.exists()){
                            file.delete();
                            System.out.println("All animals has been removed from Zoo park");
                        }

                    }
                    break;
                case 8:
                    File file =new File("Animals.txt"), file1=new File("Unicode.txt");
                    file.delete();
                    file1.delete();
                    System.out.println(" ****************TOTAL RESET****************");
                    break;
            }
        }
    }

    private static void Code_Unitialization() throws IOException {
        if(new File("Unicode.txt").exists()){
            w=Integer.parseInt(new BufferedReader(new FileReader("Unicode.txt")).readLine());
        }else{
            w=1;
        }
    }
    private static void EmptyMessage(){
        System.out.println("********************************************");
        System.out.println("|       Zoo park is empty                  |");
        System.out.println("********************************************");
    }
    private static int Menu(){
        System.out.println(" ___________________________________________");
        System.out.println("|         Welcome to Zoo-management!        |");
        System.out.println("|        Your choices are these below:      |");
        System.out.println("|                                           |");
        System.out.println("|   1. Add new animal in existing class     |");
        System.out.println("|   2. Display all Animals in The zoo park  |");
        System.out.println("|   3. Search an animal by name             |");
        System.out.println("|   4. Search an animal by code             |");
        System.out.println("|   5. Delete an animal by code             |");
        System.out.println("|   6. Feed all animals in the zoo park     |");
        System.out.println("|   7. DELETE ALL animals from the zoo park |");
        System.out.println("|   8. TOTAL RESET & DELETE ALL animals     |");
        System.out.println("|   0. Exit                                 |");
        System.out.print("|   Your answer (0-6): ");
        return (new Scanner(System.in)).nextInt(); //we make anonymous Obj because we use it once a time
    };
    private static void AllEat(){
        System.out.println("********************************************");
        Platypus.Eat();
        Tachyglossa.Eat();
        Antechinus.Eat();
        Gliders.Eat();
        Kangaroos.Eat();
        Opossums.Eat();
        Possums.Eat();
        Quolls.Eat();
        Wombat.Eat();
        Primates.Eat();
        Bears.Eat();
        Hoofed.Eat();
        Rodents.Eat();
        Bats.Eat();
        Seals.Eat();
        Dolphins.Eat();
        Whales.Eat();
        Moorning_Dove.Eat();
        Nothern_Carnidal.Eat();
        American_Robin.Eat();
        Blue_Jay.Eat();
        Song_Sparrow.Eat();
        Red_Winged_Blackbird.Eat();
        European_Starling.Eat();
        Squamates.Eat();
        Turtles.Eat();
        Crocodilians.Eat();
        Rhynchocephalians.Eat();
        Frogs.Eat();
        Toads.Eat();
        Salamandres.Eat();
        Newts.Eat();
        Caecilians.Eat();
        System.out.println("********************************************");

    }
    private static void AddAnimal() throws IOException {
        System.out.println("*****************************************************");
        System.out.println("*  What is the specie of animal you want to insert? *");
        System.out.println("*  1.    AA1 Mammals/Monotremes/Platypus            *");
        System.out.println("*  2.    AA2 Mammals/Monotremes/Tachyglossa         *");
        System.out.println("*  3.    AB1 Mammals/Marsupials/Antechinus          *");
        System.out.println("*  4.    AB2 Mammals/Marsupials/Gliders             *");
        System.out.println("*  5.    AB3 Mammals/Marsupials/Kangaroos           *");
        System.out.println("*  6.    AB4 Mammals/Marsupials/Opossums            *");
        System.out.println("*  7.    AB5 Mammals/Marsupials/Possums             *");
        System.out.println("*  8.    AB6 Mammals/Marsupials/Quolls              *");
        System.out.println("*  9.   AB7 Mammals/Marsupials/Wombats             *");
        System.out.println("*  10.   AC1 Mammals/Placentals/Primates            *");
        System.out.println("*  11.   AC2 Mammals/Placentals/Bears               *");
        System.out.println("*  12.   AC3 Mammals/Placentals/Hoofed              *");
        System.out.println("*  13.   AC4 Mammals/Placentals/Rodents             *");
        System.out.println("*  14.   AC5 Mammals/Placentals/Bats                *");
        System.out.println("*  15.   AC6 Mammals/Placentals/Seals               *");
        System.out.println("*  16.   AC7 Mammals/Placentals/Dolphins            *");
        System.out.println("*  17.   AC8 Mammals/Placentals/Whales              *");
        System.out.println("*  18.   B01 Birds/Mourning Dove                    *");
        System.out.println("*  19.   B02 Birds/Northern Carnidal                *");
        System.out.println("*  20.   B03 Birds/American Robin                   *");
        System.out.println("*  21.   B04 Birds/Blue Jay                         *");
        System.out.println("*  22.   B05 Birds/Song Sparrow                     *");
        System.out.println("*  23.   B06 Birds/Red-winged Blackbird             *");
        System.out.println("*  24.   B07 Birds/European Starlink                *");
        System.out.println("*  25.   C01 Reptiles/Squamates                     *");
        System.out.println("*  26.   C02 Reptiles/Turtles                       *");
        System.out.println("*  27.   C03 Reptiles/Crocodilians                  *");
        System.out.println("*  28.   C04 Reptiles/Rhynchocephalians             *");
        System.out.println("*  29.   B07 Amphibians/Frogs                       *");
        System.out.println("*  30.   C01 Amphibians/Toads                       *");
        System.out.println("*  31.   C02 Amphibians/Salamandres                 *");
        System.out.println("*  32.   C03 Amphibians/Newts                       *");
        System.out.println("*  33.   C04 Amphibians/Caecilians                  *");
        System.out.println("*  0.    Exit                                       *");
        System.out.print("*   Your answer (1-33) or 0: ");
        int z = (new Scanner(System.in)).nextInt();
        if (z == 0) {
            return;
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Animals.txt", true)));
        PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("Unicode.txt", false)));
        System.out.print("Name: ");
        switch (z) {
            case 1:
                out.println((new Platypus((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Platypus using an Anonymous Object Scanner
                break;
            case 2:
                out.println((new Tachyglossa((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Tachyglossa using an Anonymous Object Scanner
                break;
            case 3:
                out.println((new Antechinus((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Antechinus using an Anonymous Object Scanner
                break;
            case 4:
                out.println((new Gliders((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Gliders using an Anonymous Object Scanner
                break;
            case 5:
                out.println((new Kangaroos((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Kangaroos using an Anonymous Object Scanner
                break;
            case 6:
                out.println((new Opossums((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Opossums using an Anonymous Object Scanner
                break;
            case 7:
                out.println((new Possums((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Possums using an Anonymous Object Scanner
                break;
            case 8:
                out.println((new Quolls((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Quolls using an Anonymous Object Scanner
                break;
            case 9:
                out.println((new Wombat((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Wombat using an Anonymous Object Scanner
                break;
            case 10:
                out.println((new Primates((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Primates using an Anonymous Object Scanner
                break;
            case 11:
                out.println((new Bears((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Bears using an Anonymous Object Scanner
                break;
            case 12:
                out.println((new Hoofed((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Hoofed using an Anonymous Object Scanner
                break;
            case 13:
                out.println((new Rodents((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Rodents using an Anonymous Object Scanner
                break;
            case 14:
                out.println((new Bats((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Bats using an Anonymous Object Scanner
                break;
            case 15:
                out.println((new Seals((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Seals using an Anonymous Object Scanner
                break;
            case 16:
                out.println((new Dolphins((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Dolphins using an Anonymous Object Scanner
                break;
            case 17:
                out.println((new Whales((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Whales using an Anonymous Object Scanner
                break;
            case 18:
                out.println((new Moorning_Dove((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Primates using an Anonymous Object Scanner
                break;
            case 19:
                out.println((new Nothern_Carnidal((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Bears using an Anonymous Object Scanner
                break;
            case 20:
                out.println((new American_Robin((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Hoofed using an Anonymous Object Scanner
                break;
            case 21:
                out.println((new Blue_Jay((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Rodents using an Anonymous Object Scanner
                break;
            case 22:
                out.println((new Song_Sparrow((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Bats using an Anonymous Object Scanner
                break;
            case 23:
                out.println((new Red_Winged_Blackbird((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Bats using an Anonymous Object Scanner
                break;
            case 24:
                out.println((new European_Starling((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Dolphins using an Anonymous Object Scanner
                break;
            case 25:
                out.println((new Squamates((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Squamates using an Anonymous Object Scanner
                break;
            case 26:
                out.println((new Turtles((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Turtles using an Anonymous Object Scanner
                break;
            case 27:
                out.println((new Crocodilians((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Crocodilians using an Anonymous Object Scanner
                break;
            case 28:
                out.println((new Rhynchocephalians((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Rhynchocephalians using an Anonymous Object Scanner
                break;
            case 29:
                out.println((new Frogs((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Frogs using an Anonymous Object Scanner
                break;
            case 30:
                out.println((new Toads((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Toads using an Anonymous Object Scanner
                break;
            case 31:
                out.println((new Salamandres((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Salamandres using an Anonymous Object Scanner
                break;
            case 32:
                out.println((new Newts((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Newts using an Anonymous Object Scanner
                break;
            case 33:
                out.println((new Caecilians((new Scanner(System.in)).next(), w)).toString()); //Creating an anonymous Object Caecilians using an Anonymous Object Scanner
                break;
        }
        w++;
        out2.println(w);
        out.close(); //we do this because else that data will be lost in a buffer.
        out2.close(); //we do this because else that data will be lost in a buffer.
    }
}


