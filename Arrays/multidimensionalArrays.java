package Arrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
//declaring and initializing 2D Arrays. Format = rows x columns
    //int [][] array2D = new int[2][3]; //can hold 6 elements
    int[][] array2D_1 = {{12,23,34},{23,45,56}}; //this is a 2 x 3 array
    int[][] array2D_2 = {{12,23,34},{23,45}, {23,35,65,87}}; //this is a 3 x 4 array

    //to find the length of each row of an array
    System.out.println("length of row 1 : " + array2D_2[2].length);
    System.out.println("length of array: " + array2D_2.length);

    //print the values of  a 2D array using for loop
    for (int i = 0; i<array2D_2.length; i++){
        for (int j = 0; j<array2D_2[i].length; j++){
            System.out.println(array2D_2[i][j]);
        }
       }

       
    //print elements of a 2D array using EFL
       System.out.println("Using EFL");
       for(int[] myAccessArray: array2D_1){
        for(int num: myAccessArray){
            System.out.println(num);
        }
       }

    //acessing the Nth column of an array
       System.out.println("Accessing Nth column of an array");
    for (int k = 0; k < array2D_2.length; k++ ){
        for (int l=0; l<2; l++)
        System.out.println(array2D_2[l]);
    }

    //declaring and initializing 3D Arrays. Format = rows x columsn x height
    int [][][] array3D = {
        { {1,2,3}, 
          {1,1}, 
          {5,9,70} },

        { {4,5,6}, 
          {7,8}, 
          {2,98,76} }
        }; 

    //access the elements in a 3D elements
        System.out.println("Acessing 3D elements using EFL");
        for (int[][] level1Array: array3D){
            for (int [] level2Array :  level1Array){
                for (int num: level2Array){
                    System.out.println(num);
                }
            }

        }

    //accesing a row of an array
    System.out.println("accesing a row of an array");
    for(int [][] array1: array3D){
        System.out.println(array1[0][1]);
    }
    //accessing a specific element of an array. Block - Row - Column
    System.out.println(array3D[1][2][1]);

    
//method to find the maximum value of the last column
    int [][] bossManArray = {
        {1,5,9,45}, {2,6,10,67},
        {12,7,11,89}, {4,8,12,20}};
        int max = 0;
        for (int [] array2: bossManArray ){
            
            int array2Length = array2.length;
            int lastColumnItem = array2[array2Length-1];
            System.out.println("Last Column item: "+lastColumnItem);
                if (lastColumnItem > max){
                    max = lastColumnItem;

                }
                
        }System.out.println("Your max is: "+ max);
        
}

    }

