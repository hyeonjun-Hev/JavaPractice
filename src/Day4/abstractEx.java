package Day4;

import java.lang.reflect.AnnotatedArrayType;

abstract class Animals {
    abstract void cry();
}

class Cat extends Animals{
    @Override
    void cry() {
        System.out.println("Cat Sounds");
    }
}

class Dog extends Animals{
    @Override
    void cry() {
        System.out.println("Dog Sound");
    }
}

public class abstractEx {
    public static void main(String[] args) {
        Animals animals = new Animals() {
            @Override
            void cry() {
                System.out.println("cry anythings");
            }
        };
        animals.cry();

        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
