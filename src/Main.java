import animal.Crab;
import animal.Fish;
import animal.Shark;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish("fish", 2);
        System.out.println(fish.getCurrentCapacity());
        fish.flee();
        Crab crab = new Crab("crab", 2);
        Shark shark = new Shark("shark");
        System.out.println(fish.getCurrentCapacity());
        shark.hunt();
        shark.flee();
        shark.flee();
        shark.hunt();
        shark.hunt();
        crab.hunt();
        System.out.println(shark.getCurrentCapacity());

    }
}