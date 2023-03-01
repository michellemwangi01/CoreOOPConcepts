package Arrays;
import java.util.Scanner;
public class learningArrays {
    public static void main(String[] args) {
    //declare array to take in grades for 5 students
    int[] studentGrades = new int[5];
    //initialize array elements
    studentGrades[0] = 12;
    studentGrades[1] = 21;
    studentGrades[2] = 23;
    studentGrades[3] = 43;
    studentGrades[4] = 34;


    //declare and initialize array in one line
    int [] studentsGrades = {98,97,96,95,95};


    //print one value of array
    System.out.println(studentsGrades[0]);

    //print out all values of array
    for (int i = 0; i<5; i++){
        System.out.println(studentsGrades[i]);
        
    }
    System.out.println(studentsGrades.length);

    //declare array to input salary for 5 developers
    float[] javaDevs = new float[5];
    Scanner mySalaryScanner = new Scanner(System.in);
    System.out.println("Enter 5 dev salaries:");
    for (int i = 0; i<5; i++){
        javaDevs[i] = mySalaryScanner.nextFloat();
    }
    mySalaryScanner.close();

    //print the dev salaries
    System.out.println("DEVELOPER SALARIES");
    for (int i=0; i<5; i++){
        System.out.println("Developer " + i + " salary: " + javaDevs[i]);
    }
    
    //computer sum of dev salaries
    float salarySum = 0;
    for (int j = 0; j<5; j++){
        salarySum = salarySum += javaDevs[j];
    }
    System.out.println("Cumulative sum = " + salarySum);
    System.out.println("\n");

    //compute average dev salaries
    float averageSalaries = salarySum / javaDevs.length;
    System.out.println("Average Salaries = " + averageSalaries);
    System.out.println("\n\n\n");


    //LOOPING THROUGH ARRAYS USING **FOR-EACH / ENHANCED FOR LOOP(EFL)**
    //printing out
    char[] randomLetters = {'z', 'l','m','n'};
    for (char k : randomLetters){
        System.out.println("Characters: " + k);
    }
    
    //Sum of Array Elements using EFL
    int  randomNumbers[] = {23,34,54};
    int cumulativeSum = 0;
    for (int number: randomNumbers){
        cumulativeSum += number;
        System.out.println("Cumulative sum = " + cumulativeSum);
    }

    //average of numbers
    int randomNumbersLength = randomNumbers.length;
    float average = (float)cumulativeSum / (float)randomNumbersLength;
    System.out.println("Average of numbers = " + average);
     


    //accepting input using EFL
    /* 
    String[] randomNames = new String[3];
    Scanner myNameScanner = new Scanner(System.in);
    for (String name: randomNames){
        name = myNameScanner.next();
        System.out.println(name);
    }
    myNameScanner.close();
    */
    
    

}
}