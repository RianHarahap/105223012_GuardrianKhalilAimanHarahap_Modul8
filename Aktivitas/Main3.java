class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Bark");
    }
}

class Pig extends Animal {
    void oink(){
        System.out.println("Oink");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Pig pig = new Pig();
        pig.eat();
        pig.oink();
    }
    
}
