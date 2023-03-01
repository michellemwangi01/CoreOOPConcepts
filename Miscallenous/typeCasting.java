package Miscallenous;

//The process of converting the value of one data type (int, float, double, etc.) to another data type is known as typecasting.
public class typeCasting {
    public static void main(String[] args) {
        //WIDENING TYPECATING or IMPLICIT TYPECASTING
        //In Widening Type Casting, Java automatically converts one data type to another data type. In the case of widening typecasting the lower datatype (having less size) is converted to the higher datatype (having larger size) so there is no data loss, thus this conversion happens automatically in java.
        
        int age = 24; //create integer variable
        double stringAge = age; //convert to double
        System.out.println("Age as an int: " + age);
        System.out.println("Age as a double: " + stringAge);



        //NARROWING TYPECASTING or EXPLICIT TYPECASTING
        //in narrowing typecasting a variable of higher type (having larger size) is converted to a lower data type(having less size) whic means data losss may take place. therefore it does not happen automatically and has to be explicitly stated.

        double num = 10.99; //create double variable
        int newnum = (int)num; //convert to int
        System.out.println("Num as an double " + num);
        System.out.println("Num as an integer: "+ newnum);


        //converting to other types (int to string)
        int myage = 24;
        String myStringAge = String.valueOf(myage);
        System.out.println("int myage " + myage);
        System.out.println("string myage " + myStringAge);
        //int Sumofage = myStringAge + 2; //will error
        //int Sumofage2 = myage + 2; //will accept

        //converting String to int
        //String stringYear ="2022";
        //int intYear = Integer.parseInt(stringYear);

    }
}
