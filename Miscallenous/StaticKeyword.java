package Miscallenous;

public class StaticKeyword {
    static int a = 10;
    int b = 5;
    static void display (){
        System.out.println("STATIC METHOD");
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    public static void main(String[] args) {
        //static method display and static variable a can be accessed directly without use of a method
        //if however there was another class in this program, we would have to use classname.methodname or classname.variable name
        display();
        System.out.println(a);

        //but for NON-STATIC variable b, we have to use an object to access it .
        StaticKeyword stkeyword = new StaticKeyword();
        System.out.println(stkeyword.b);

        //STATIC BLOCK IS CALLED AUTOMATICALLY WITH THAT CLASS. CALLED BY DEFAULT

        
    }
}
