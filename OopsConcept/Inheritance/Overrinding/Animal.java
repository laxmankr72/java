package OopsConcept.Inheritance.Overrinding;

public class Animal {
    void makeSound(){
        System.out.println("Generic Animal Sound");
    }
}
class Dog extends Animal{

    void makeSound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}
class Cow  extends Animal{
    void makeSound(){
        System.out.println("Moo");
    }
}