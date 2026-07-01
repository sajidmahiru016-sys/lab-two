//Lab Eight Task 1
class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.sound();
        cat.sound();
        dog.sound();
    }
}
