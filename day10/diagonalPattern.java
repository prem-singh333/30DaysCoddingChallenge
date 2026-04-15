package day10;

import java.util.*;

public class diagonalPattern {
    public static void main(String args[]){
        // Q no. 13 Print Diagnol star pattern

       // * * * * *
       // * *   * *
       // *   *   *
       // * *   * *
       // * * * * *

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int n = sc.nextInt();

       // check n is odd and also check the n is grater the 4
       if(n < 5 || n%2 == 0){
        System.out.println("Please enter odd number or n is grater the 4!");
        return;
       }

       //if user enter right number
       for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){

            if(i == 0 || j == 0 || i == n-1 || j == n-1 ||
                (i == j || j == n-i-1) 
            ){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }
}
