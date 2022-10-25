import java.util.*;
public class TestgetChar {
    // Java program to demonstrate
// the getChars() Method.
        public static void main(String[] args)
        {

            // create a StringBuffer object
            // with a String pass as parameter
            StringBuffer str = new StringBuffer("Begin Geeks For Geeks");

            // print string
            System.out.println("String = " + str.toString());

            // create a char Array
            char[] array = new char[15];

            // initialize all character to .(dot).
            Arrays.fill(array, '.');

            // get char from index 0 to 9
            // and store in array start index 3
            str.getChars(0, 9, array, 0);

            // print char array after operation
            System.out.print("char array contains : ");

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

}
