package InheritanceAndOverriding;

public class myDogs extends myAnimals {
    
    String dogName ;
    public void animalTalk() {
        super.animalTalk();
        System.out.println("I am also a dog");
        //System.out.println(super.animalName);
    }
}
