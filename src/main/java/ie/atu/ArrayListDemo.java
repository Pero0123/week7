package ie.atu;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args)
    {
       printArray();
    }

    //method to intitialize array and print out contents
    static void printArray()
    {
        //declares an array of ints
        ArrayList<integer> arrayList = new ArrayList();
        int i=0;

        //initializes all elements in the array
        for(i=0;i<size(anArray);i++)
        {
            anArray.add(i) = 100+(i*100);
        }
        //prints out all elements in the array
        for(i=0;i<size(anArray);i++)
        {
            System.out.println("Element at "+ i + " " +"is "+anArray.get(i));
        }
    }
}
