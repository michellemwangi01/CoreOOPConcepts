package AbstractMethodsAndClasses;

import java.util.Scanner;

public class CarType extends myCars{
    Scanner myScanner = new Scanner(System.in);

    public String get_make() {
        System.out.println("Enter the make of the car");
        String myCarMake = myScanner.nextLine();
        System.out.println("Car Make: " + myCarMake);
        return myCarMake;
    }

    public String get_model(){
        System.out.println("Enter the make of the car");
        String myCarModel = myScanner.nextLine();
        System.out.println("Car Model: " + myCarModel);
        return myCarModel;
    }

    public String get_color() {
        System.out.println("Please Enter the Color of your Car: ");
        String truckColor = myScanner.nextLine();
        System.out.println("Your truck color is: " + truckColor);
        return truckColor;
    }
    public int get_year(){
        System.out.println("Please Enter Manufacture Year of the Car: ");
        int carYear = myScanner.nextInt();
        System.out.println("Your manufacture year is: "+ carYear);
        return carYear;

    }
}
