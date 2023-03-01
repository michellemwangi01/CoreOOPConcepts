package AbstractMethodsAndClasses;
//ABSTRACT CLASS WITH CONCRETE & ABSTRACT METHODS
abstract public class myCars extends myVehicles {
    public void vehicleSpeaks(){
        System.out.println("I am a vehicle and a car");
    }

    public void moveBackwards () {
        System.out.println("Put me in REVERSE gear");
    }

    public void moveForward() {
        System.out.println("Put me in DRIVE gear");
    }

    

    
}

