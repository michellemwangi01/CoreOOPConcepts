package Miscallenous;

public class ImplementRunnableInterface implements Runnable {
    public void run(){
        try{
            for(int i = 0; i <5 ; i++){
                System.out.println("How many times shall i print this?");
            }
            }
        catch(Exception e){
                System.out.println(e);
            }

    }

    public static void main(String[] args) {
        ImplementRunnableInterface myRunInt = new ImplementRunnableInterface();
        Thread myThread = new Thread(myRunInt);
        myThread.start();
    }
}
