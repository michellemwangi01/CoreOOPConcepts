package Miscallenous;

public class Rectangle {
    //declare the instance variables
    private float width;
    private float length;


    //EITHER use the default constructor to initialize the variables
    Rectangle (){
        length = 1.0f;
        width = 1.0f;
    }

    //OR use the parametized constructor to initialize the variables
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;

    }

    //Use getter method to return the length value
    public float getLength(){
        return length;
    }

    //Use setter method to update the length value
    public void setLength (float newLength){
        this.length = newLength;
    }

    //Use getter method to return the width value
    public float getWidth(){
        return width;
    }

    //Use setter method to update the width value
    public void setWidth(float newWidth){
        this.width = newWidth;
    }

    //method to calculate and return area
    public double getArea(){
        double area = length * width;
        return area;
    }

    //method to calculate and return perimeter
    public double getPerimeter(){
        double perimeter = (2 * (length + width));
        return perimeter;
    }

    //method to return length and width value as string
    public String toString(){
        return length + " " + width;
    }


    public static void main(String[] args) {
        //instance 1 created with default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("default constructor values for all objects if default constuctor is used");
        System.out.println(r1.length);
        System.out.println(r1.width);

        //instance 2 created with parametized constructor
        System.out.println("\ndefault constructor values for all objects if parametized constuctor is used");
        Rectangle r2 = new Rectangle(32.1f, 42.4f);
        System.out.println(r2.length);
        System.out.println(r2.width);


        //update length or width values
        System.out.println("\nUse Setter and getter to update lenth and width values separately");
        r2.setWidth(23.6456f);
        r2.setLength(43.656f);
        System.out.println(r2.length); 
        System.out.println(r2.width);


        //return both values to string
        System.out.println("\nReturn both values to string");
        String lenwid = r2.toString();
        System.out.println(lenwid);


        //Print out area and perimeter
        System.out.println("\nRectangle Area = " + r2.getArea());
        System.out.println("Rectangle Perimeter = " + r2.getPerimeter());

        //Object s1 = getObject();




    }

}
