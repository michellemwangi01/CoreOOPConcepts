package Arrays;
import java.util.Arrays;;

public class palindrome {
    
  public void myPalindromeMethed(long myNum){
    String StrNum = Long.toString(myNum);
    char [] strDigit = StrNum.toCharArray();
    System.out.println("Original Array is: ");
    System.out.println(Arrays.toString(strDigit));
    int arrLength = strDigit.length;
    char [] reverseMyNum = new char [arrLength];
    int j = 0;
    for (int i = arrLength-1; i >= 0; i--){
        System.out.println("Digit " + i + " is " +strDigit[i]);
        reverseMyNum[j] = strDigit[i];
        j++;

        }
    System.out.println("Reverse Array is: ");
    System.out.println(Arrays.toString(reverseMyNum));

    System.out.println(Arrays.equals(reverseMyNum, strDigit));

    if ((Arrays.equals(reverseMyNum, strDigit)) == true){
      System.out.println(myNum + " is a palindrome");
    }
    else if ((Arrays.equals(reverseMyNum, strDigit)) == false){
      System.out.println(myNum + " is NOT a palindrome");
    }
    else
      {System.out.println("Thank you!");}
    

    
    
  }

  }
