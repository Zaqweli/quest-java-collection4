import java.util.TreeMap;
import java.util.*;


public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        Comparator<Hero> comparator = new Comparator<Hero>() {
            public int compare(Hero orig, Hero compare){
                return orig.getName().compareTo(compare.getName());
            }
        };

        Map<Hero, Flower> treeFloHero = new TreeMap<>(comparator);
        treeFloHero.put(hulk, rose);
        treeFloHero.put(thor, rose);
        treeFloHero.put(scarletWitch, rose);
        treeFloHero.put(vision, tulip);
        treeFloHero.put(captainAmerica, lily);
        treeFloHero.put(doctorStrange, violet);
        treeFloHero.put(blackWidow, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap

        System.out.println(treeFloHero.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower

        for(Hero hero : treeFloHero.keySet()){
            Flower flower = treeFloHero.get(hero);
            System.out.println(flower.getName());
        }
    }
}
