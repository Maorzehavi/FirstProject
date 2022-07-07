package animal;

public class Shark extends SeaAnimals {
    public Shark() {
    }

    public Shark(String type) {
        super(type);
    }

    public Shark(String type, int age) {
        super(type, age);
    }

    {
        maxCapacity = 30;
        currentCapacity = maxCapacity / 2;
    }

    @Override
    public void swim() {
        System.out.println("the shark is swimming");
    }

    @Override
    protected void eat() {
        if (checkCapacity(this.maxCapacity, this.currentCapacity)) {
            System.out.println("the shark is eating");
            this.currentCapacity += 5;
        } else {
            System.out.println("your stomach is full");
        }

    }
//
//    @Override
////    public void hunt() {
////        System.out.println("the shark is hunting");
////        if (checkActionRandom()) {
////            System.out.println("successes!");
////            eat();
////        } else {
////            System.out.println("maybe next time");
////        }
////    }

    @Override
    public void flee() {
    super.flee(3);
    }
}
