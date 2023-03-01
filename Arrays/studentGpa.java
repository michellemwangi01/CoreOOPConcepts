package Arrays;
import java.util.Scanner;
public class studentGpa{
    

    public String personName () {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("My name is Mira");
        String name = myScanner.next();
        myScanner.close();
        System.out.println("My name is " + name);
        return name;
    }
    
    
}

