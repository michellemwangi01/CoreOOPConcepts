package InheritanceAndOverriding;

public class Main {
    public static void main(String[] args) {
        //myAnimals animalOne = new myAnimals();
        //animalOne.animalTalk();

        myDogs dogOne = new myDogs();
        dogOne.animalTalk();
        //dogOne.animalName;
        System.out.println(dogOne.animalName = "mama");    
        System.out.println(dogOne);
        

        //myAnimals dogTwo = new myDogs();
        //dogTwo.animalTalk();
    }
}
