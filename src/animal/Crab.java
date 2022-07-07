package animal;

public class Crab extends SeaAnimals {
    public Crab() {
    }

    {
        maxCapacity = 7;
        currentCapacity = maxCapacity / 2;
    }

    public Crab(String type) {
        super(type);
    }

    public Crab(String type, int age) {
        super(type, age);
    }

    @Override
    public void swim() {
        System.out.println("the crab burly swimming");
    }

    @Override
    protected void eat() {
        if (checkCapacity(this.maxCapacity, this.currentCapacity)) {
            System.out.println("the crab is eating");
            this.currentCapacity++;
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

    public void walk() {
        System.out.println("the crab is walking");
    }
}
