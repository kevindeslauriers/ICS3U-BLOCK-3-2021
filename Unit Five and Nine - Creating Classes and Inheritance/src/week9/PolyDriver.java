package week9;

public class PolyDriver {
   public static void main(String[] args) {
      Animal animal = new Animal();
      animal.makeSound();

      Dog dog = new Dog();
      dog.makeSound();

      Cat cat = new Cat();
      cat.makeSound();

      Animal animal1 = new Dog();
      animal1.makeSound(); // dynamic binding
      // animal1 = cat;
      // animal1.makeSound();
      animal1 = dog;

      ((Dog) animal1).chaseTail();
      dog.chaseTail();
      animal1 = cat;
      ((Dog) animal1).chaseTail();

   }

}
