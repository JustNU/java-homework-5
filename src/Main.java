import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Starting task one");
        runTaskOne();
        System.out.println("Task one done\n");

        //System.out.println("Starting task two");
        //runTaskTwo();
        //System.out.println("Task two done\n");

        System.out.println("Starting task three");
        runTaskThree();
        System.out.println("Task three done");
    }

    // task 1
    static void runTaskOne()
    {
        // run method on string array
        String words[] = {"word1", "word2", "word3", "word4", "word5"};

        System.out.println(Arrays.toString(words));

        swapArrayElements(words, 0, 4);
        swapArrayElements(words, 2, 3);

        System.out.println(Arrays.toString(words));

        // now run it on int array
        Integer numbers[] = {6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(numbers));

        swapArrayElements(numbers, 0, 2);
        swapArrayElements(numbers, 1, 4);

        System.out.println(Arrays.toString(numbers));
    }

    // method to swap array elements
    static <T> void swapArrayElements(T sentArray[], int index1, int index2) 
    {
        // create temp variable to store first index in
        T temp = sentArray[index1];

        // replace element on index1 with element on index2
        sentArray[index1] = sentArray[index2];

        // replace element on index2 with element from temp
        sentArray[index2] = temp;
    }
    
    /*
    // todo
    // task 2
    static void runTaskTwo()
    {

    }
    */

    // task 3
    static void runTaskThree()
    {
        String string1 = "blah blah blah no numbers here";
        String string2 = "blah blah blah 1 2 3 this string has numbers";
        String string3 = "1 2 3";
        
        try 
        {
            stringNumberException(string1);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        
        try 
        {
            stringNumberException(string2);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        
        try 
        {
            stringNumberException(string3);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // method that throws an exception if a string has number in it
    static void stringNumberException(String data) throws Exception
    {
        // convert string into array of chars
        char charArray[] = data.toCharArray(); 
        
        for (char character : charArray) 
        {
            if (Character.isDigit(character)) 
            {
                throw new Exception("The string must not contain any numbers! (" + data + ")");
            }
        }

        System.out.println("This string does not have any numbers (" + data + ")");
    }
}