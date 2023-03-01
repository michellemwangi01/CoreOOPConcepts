package Interfaces;

public class class_cityVacay implements Interface_localVacation {
    String cityName;
    int destinationRating;

    public void setCityName(String cityName){
        this.cityName = cityName;
        
    }

    public String getCityName(){
        return cityName;
    }

    public void setVacationDestinationRating(int destinationRating){
        this.destinationRating = destinationRating;
    }

    public int getVacationDestinationRating(){
        return destinationRating;
    }

    public boolean isFun(){
        boolean fun = true;
        return fun;


        
    }

   

   
}
