package ie.atu;

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
        int i;

        //allocates memory for 10 ints
        anArray = new int[10];

        //initializes all elements in the array
        for(i=0;i<10;i++)
        {
            anArray[i] = 100+(i*100);
        }

        //prints out all elements in the array
        for(i=0;i<10;i++)
        {
            System.out.println("Element at "+ i + " " +"is "+anArray[i]);
        }
    }
}
