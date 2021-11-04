package week9;

public class PolyDriver {
   public static void main(String[] args) {
      /*
       * Not Ploymorphism - reference is the same type as the Object Animal animal =
       * new Animal(); animal.makeSound(); Cat cat = new Cat(); cat.makeSound(); Dog
       * dog = new Dog(); dog.makeSound(); dog.chaseTail();
       */
      /*
       * Animal animal = new Cat(); animal.makeSound();
       */

      // Animal animal = new Dog();
      // animal.makeSound(); // dynamic binding

      // ((Dog) animal).chaseTail();
      /*
       * Gadget g = new Gadget(); Gadget.setStatus(4); Gadget g2 = new Gadget();
       */

      Beverage coke = new Beverage(8);
      Beverage pepsi = new Beverage(10);
      coke.sell(3);
      pepsi.sell(2);
   }

}
