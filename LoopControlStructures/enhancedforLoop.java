package LoopControlStructures;
import java.util.Scanner;
public class enhancedforLoop {
    public static void main(String[] args) {
        getSumofAges();
        getAverageAges();
        
    }
      
    
    public static int getSumofAges() {
        int sum_ages = 0;
        int age[] = new int[5];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the ages:");
        for (int i=0; i<3; i++){
            age[i] = myScanner.nextInt();
            myScanner.close();
        }
        for (int x : age){
            sum_ages = sum_ages + x;
        }
        System.out.println("sum of ages: "+ sum_ages);
        return sum_ages; 
    }

    public static int getAverageAges() {
        
        int sum_ages_ = getSumofAges();
        int avg_ages =  sum_ages_ / 3;
        System.out.println("average ages:" + avg_ages);
        return avg_ages;
    }
    
    }

