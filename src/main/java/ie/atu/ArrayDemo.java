package ie.atu;
import java.util.ArrayList;


public class ArrayDemo {
    public static void main(String[] args)
    {
       printArray();
    }

    //method to intitialize array and print out contents
    static void printArray()
    {
        //declares an array of ints
        int[] anArray;
        int i=0;

        //allocates memory for 10 ints
        anArray = new int[10];

        //initializes all elements in the array
        for(int val: anArray)
        {
            anArray[i] = 100+(i*100);
            i++;
        }
        i=0;
        //prints out all elements in the array
        for(int val: anArray)
        {
            System.out.println("Element at "+ i + " " +"is "+anArray[i]);
            i++;
        }
    }
}
