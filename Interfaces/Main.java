package Interfaces;

public class Main {
    public static void main(String[] args) {
        class_cityVacay mycityVacay = new class_cityVacay();
        mycityVacay.setCityName("Mombasani");
        System.out.println("City Name: "+ mycityVacay.getCityName()); 


        mycityVacay.setVacationDestinationRating(5);
        System.out.println("Destination Rating: " + mycityVacay.getVacationDestinationRating() + " out of 5");

        System.out.println(mycityVacay.isFun()); 
    }
}
