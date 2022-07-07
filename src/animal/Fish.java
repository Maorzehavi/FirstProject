package animal;

public class Fish extends SeaAnimals{


    public Fish() {
    }
    {
        maxCapacity =10;
        currentCapacity=maxCapacity/2;
    }

    public Fish(String type) {
        super(type);
    }

    public Fish(String type, int age) {
        super(type, age);
    }

    @Override
    public void swim() {
        System.out.println("the fish is swimming");
    }

    @Override
     protected void eat() {
        if (checkCapacity(maxCapacity, currentCapacity)){
            System.out.println("the fish is eating");
            currentCapacity++;
        } else {
            System.out.println("your stomach is full");
        }
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    @Override
    public void flee() {
        super.flee(1);
    }
}
