package Arrays;
//import java.util.Scanner;
import java.util.Arrays;

public class Main {
        
    public static void main(String[] args) {
        arraysAndMethods newarray = new arraysAndMethods();
        int [] A = {1,2,3,4, 23,45,65};
        System.out.println("-----------------swapping-----------------");
        newarray.swapping( A, A[1], A[2]);


        System.out.println("-----------Take in Array Values using a method------------------");
        int [] myTestArray = newarray.takeInArrayValues();
        System.out.println("plrrrr");
        System.out.println(Arrays.toString(myTestArray));


        System.out.println("-----------------print individual elements-----------------");
        newarray.printArrayElementsMethod(myTestArray);

        System.out.println("-----------------max array value-----------------");
        newarray.maxArrayValue(myTestArray);

        System.out.println("-----------------min array value-----------------");
        newarray.MinArrayValue(myTestArray);


        System.out.println("My palindrome test");
        palindrome myPal = new palindrome();
        myPal.myPalindromeMethed(12321);
        
        
    }

    }



