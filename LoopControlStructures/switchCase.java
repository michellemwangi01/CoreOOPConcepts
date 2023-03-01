package LoopControlStructures;
import java.util.Scanner;
public class switchCase{
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter an age");
    int age = myScanner.nextInt();
    
    switch (age){
        case 1:
        System.out.println("Too Young!");
        break;

        case 2:
        System.out.println("Very Young");
        break;

        case 3:
        System.out.println("Young");
        break;

        case 4:
        System.out.println("Kinda old");
        break;

        case 5:
        System.out.println("Old");
        break;

        case 6:
        System.out.println("Enter age again: ");
        int agebracket = myScanner.nextInt();
            switch (agebracket){
            case 11:
            System.err.println("This is a test for the nested case");
            break;

            case 12:
            System.out.println("Second test for nested case");
            break;

            default:
            System.out.println("The end");
            break;
        }

        default:
        System.out.println("Thank you!!!!!!!!");
        break;
    }myScanner.close();
}

}