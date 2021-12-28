/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_shopx;


public class Test_ShopX {
  
    public static void main(String[] args) {
     
      int arr[][] = {{ 1, 2, 3 },
                      { 4, 5, 6 },
                      { 7, 8, 9, }};
      
      System.out.println("Print Matrix");
      printMatrix(arr);
      System.out.print("\n Maxtrix after rotating 90 degrees clockwise \n");
      rotate90clockwise(arr);
    }
 // Function for print matrix
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            System.out.print( arr[i][j] + "\t");
            System.out.println("\n");
        }
    }
 // Function for print matrix after rotating 90 degrees
    static void rotate90clockwise(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
        for (int j =arr[0].length-1 ; j >=0 ; j--) {
            System.out.print(arr[j][i] + "\t");
        }
     
        System.out.println("\n");   
      }
    }
}
