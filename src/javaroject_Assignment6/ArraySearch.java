// package declaration is compulsory
package javaroject_Assignment6;
import java.util.Arrays; // import Arrays class
import java.util.Scanner; // import Scanner class

/*
This program will help you understand the concept of Arrays 
using the example of Binary Search Algorithm.
*/

//Main Class
public class ArraySearch {
	public static void main(String args[]) // main method starts
	   {
		  
	      int array[]; // integer array declaration

	      Scanner sc = new Scanner(System.in); // Scanner to take input from user.
	      //Input elements
	      System.out.println("Enter number of elements:");
	      int sizeOfArray = sc.nextInt(); // initialize size of the array
	      array = new int[sizeOfArray]; // instance of array

	      System.out.println("Enter " + sizeOfArray + " integers");

	      for (int counter = 0; counter < sizeOfArray; counter++) // for loop to initialize the array
	      {
	          array[counter] = sc.nextInt();
	      }
	      
	      Arrays.sort(array); // sorting the array
	      //Print Sorted array
	      System.out.println("Sorted Array is :-");
	      
	      for (int counter = 0; counter < sizeOfArray; counter++) //for loop to print the sorted array
	      {
	    	  System.out.println(array[counter]);
	      }
	          

	      System.out.println("Enter the search value:");
	      int searching_item = sc.nextInt(); // initialize the Searching_item variable

	      // initialize the variables 
	      int first_index=0;
	      int last_index=sizeOfArray-1;
	      int middle_index=(first_index+last_index)/2;
	      
	      //Close scanner class
	      sc.close();
	      
	      while(first_index <= last_index) // logic for searching the item
	      {
	          if(array[middle_index] < searching_item) 
	          {
	        	  first_index=middle_index+1;
	          }
	          else if ( array[middle_index] == searching_item ) // condition to check if searching item is found
	          {
	            System.out.println(searching_item + " found at location " + middle_index  + ".");
	            break;
	          }
	          else
	          {
	        	  last_index = middle_index - 1;
	          }
	          middle_index = (first_index + last_index)/2;

	          if ( first_index > last_index ) // condition to check if searching item is not found
	          {
	              System.out.println(searching_item + " is not found.\n");
	          }
	      }
	    }
}
