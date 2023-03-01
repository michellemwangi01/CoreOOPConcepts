package AbstractMethodsAndClasses;
//ABSTRACT CLASS
  
abstract public class myVehicles {
    int vehicle_ID;
    String vehicle_model;
    String vehicle_type;
    static double vehicle_cost = 23223.98;
    abstract public void vehicleSpeaks();
    abstract public void moveForward();
    abstract public void moveBackwards();
    abstract public String get_color();
    abstract public int get_year();
    private String honk(){
        System.out.println("Excuuuuseee meeeee");
        String car_honk = "I have honked";
        return car_honk;
    }

    String car_sound = honk();
}
