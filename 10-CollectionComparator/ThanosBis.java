import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThanosBis {

    public static void main(String[] args) {

        List<HeroBis> heroes = new ArrayList<>();
        heroes.add(new HeroBis("Hulk", 49));
        heroes.add(new HeroBis("Black Widow", 34));
        heroes.add(new HeroBis("Captain America", 100));
        heroes.add(new HeroBis("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);
        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Comparator<HeroBis> ageComparator = new Comparator<HeroBis>() {
            @Override
            public int compare(HeroBis hero1, HeroBis hero2) {
                return hero2.getAge() - hero1.getAge();
            }
        };
        Collections.sort(heroes, ageComparator);
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<HeroBis> heroes) {
        for (HeroBis heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}