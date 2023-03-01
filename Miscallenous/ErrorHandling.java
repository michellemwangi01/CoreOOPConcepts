package Miscallenous;

public class ErrorHandling {
    public void numDivisor(){

        try{
        int myNum = 12;
        float answer = myNum / 0; 
        System.out.println(answer);
      }  
      catch(ArithmeticException e){
        System.out.println(e);
        System.out.println("PROGRAM CONTINUES: \n Divide by another number that is not 0");
      }
        
    }

    public void arrayAssigner(){
        try{
            int [] myArray = new int[5];
            myArray[5] = 12;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("PROGRAM CONTINUES: \n Please enter the correct index");
        }
        finally {
            System.out.println("This is the finally block");
        }
    }

    public static void main(String[] args) {
        ErrorHandling er = new ErrorHandling();
        System.out.println("---------------Arithmetic Exception--------------------------");
        er.numDivisor();

        System.out.println("---------------Array Index Exception--------------------------");
        er.arrayAssigner();
    }
}
