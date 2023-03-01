package Arrays;
import java.util.Scanner;
import java.util.Arrays;
//method that takes in an array and 2 integers and swaps the array elements
public class arraysAndMethods {
    public void swapping(int [] yourArray, int a, int b) {
        int tempNum;
        tempNum = yourArray[1];
        yourArray[1] = yourArray[2];
        yourArray[2] = tempNum;
        System.out.println("Your swapped Array is");
        System.out.println(Arrays.toString(yourArray));
        
    }

    //method that takes in an array and prints all its elements
    public void printArrayElementsMethod(int [] intarray){
        System.out.println("Print out each element of the array");
        for(int numInt : intarray){
            System.out.println(numInt);
        }
    }


     //method to take in values into an array
     public int [] takeInArrayValues(){
        System.out.println("Enter the size of the array to be created");
        Scanner myScanner = new Scanner(System.in);
        int size = myScanner.nextInt();
        System.out.println("Enter " + size + " Values:");
        int [] myInputArray = new int [size];
        for (int i = 0; i<size; i++){
            myInputArray[i]  = myScanner.nextInt();
            
        }
        myScanner.close();
        return myInputArray;
    }

    //method to find max value in an array
    public int maxArrayValue (int [] maxArray){
        int max = 0;
        for (int y : maxArray){
            if (y > max){
                max = y;
            }
        
        }
        System.out.println("Maxiumum Value is: "+ max);
        return max;
    }


   //method to find min value of an array
    public int MinArrayValue(int [] minArray){
        int min = minArray[0];
        for (int m: minArray){
            if(m < min){
                min = m;
            }
        }
        System.err.println("Minimum Value is: " + min);
        return min;
    }
    }

