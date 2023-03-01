package Miscallenous;
import java.util.Scanner;
import java.util.logging.StreamHandler;
import java.util.Arrays;

public class STRiNGpalindrom {
    public void palindroMethod(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter your text: ");
        String s=input.nextLine();

      char [] stringholder=new char[s.length()];
   
      int count=0;
      System.out.println("----------loop below displays the TEXT in chars----------");

        for(int i=0; i<s.length(); i++){
            System.out.println( s.charAt(i));
            
        }
System.out.println("-----------loop below displays TEXT in one line----------");
        for(int j=s.length()-1; j>=0;j--){
         stringholder[count]=s.charAt(j);
         count++;
            
        }
        System.out.println(Arrays.toString(stringholder));
        

        
    }
public static void main(String[] args) {
    STRiNGpalindrom paliobj=new STRiNGpalindrom();
    paliobj.palindroMethod();

}
    
}