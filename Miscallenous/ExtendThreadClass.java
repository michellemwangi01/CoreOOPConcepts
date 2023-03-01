package Miscallenous;

public class ExtendThreadClass extends Thread{
    public void run(){
        try{
            for(int i = 0; i < 5; i ++ ){
            System.out.println("Print this line");
            }
        }
        catch(Exception e){
            System.out.println("Exception Caught");
        }
    }



public static void main(String[] args) {
    ExtendThreadClass myClassObj = new ExtendThreadClass();
    myClassObj.start();
    

}
}
