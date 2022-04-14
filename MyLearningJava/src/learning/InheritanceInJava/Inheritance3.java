package learning.InheritanceInJava;

class Animal {
    public void sleep() {
        System.out.println("It can sleep");
    }

    public void eat() {
        System.out.println("it can eat");
    }
}

class Tiger extends Animal {
    public void hunt() {
        System.out.println("It can hunt");
    }

}

class Cow extends Animal {
    public void eatGrass() {
        System.out.println("eat only grass");
    }
}

public class Inheritance3 {
    //hierarchical inheritance
    //One super class with multiple sub classes
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();
        c.eatGrass();
        c.sleep();
        Tiger t = new Tiger();
        t.eat();
        t.hunt();
        t.sleep();
    }
}

