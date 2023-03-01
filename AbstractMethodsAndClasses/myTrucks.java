//CONCRETE CLASS WITH ALL CONCRETE METHODS
package AbstractMethodsAndClasses;
import java.util.Scanner;
public class myTrucks extends myVehicles{
    Scanner myScanner = new Scanner(System.in);
    public void vehicleSpeaks(){
        System.out.println("I am a vehicle and a truck");
    }
    public String get_color() {
        System.out.println("Please Enter the Color of your Truck: ");
        String truckColor = myScanner.nextLine();
        System.out.println("Truck Color: " + truckColor);
        return truckColor;
    }
    public int get_year(){
        System.out.println("Please Enter Manufacture Year of the Truck: ");
        int carYear = myScanner.nextInt();
        System.out.println("Manufacture Year: "+ carYear);
        return carYear;

    }

    public void moveBackwards(){
        System.out.println("REVERSE me");
    }

    public void moveForward(){
        System.out.println("DRIVE me");
    }
}
