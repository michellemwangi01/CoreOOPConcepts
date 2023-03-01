package Arrays;
import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;

public class ArraytoSortInOrder {
    public void numberSorter() {
        System.out.println("How many numbers so you want to sort?");
        Scanner myScr = new Scanner(System.in);
        int arrSize = myScr.nextInt();
        int [] numArray = new int [arrSize];
        System.out.println("Please enter numbers: ");
        for (int i = 0; i<arrSize; i++){
            numArray[i] = myScr.nextInt();
        }
        System.out.println("Your array is: ");
        System.out.println(Arrays.toString(numArray));

        Arrays.sort(numArray);
        System.out.println("Your sorted array (asc): ");
        System.out.println(Arrays.toString(numArray));
        myScr.close();
    
        /*
        System.err.println("Your sorted array (desc): ");
        Arrays.sort(numArray, Collections.reverseOrder());
        
         */
        
    }

    public static void main(String[] args) {
        ArraytoSortInOrder myObj = new ArraytoSortInOrder();
        myObj.numberSorter();
    }
}
