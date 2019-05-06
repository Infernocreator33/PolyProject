package polyproject;
import java.util.*;
public class PolyProject 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        Goat goat = new Goat();
        Dog dog = new Dog();
        
        Animal[] animals = new Animal[2];
        animals[0] = goat;
        animals[1] = dog;

        for(Animal animal: animals)
        {
          animalSpeak(animal);
        }

    }
    public static void animalSpeak(Animal animal)
    {
        animal.speak();
    }
}
