  import java.util.*;

    public class Stringreverse
    {
        public static void main(String args[])
        {
            String original;
            Scanner in = new Scanner(System.in);
            //ask user to enter a string
            System.out.println("Enter a string");
            original = in.nextLine();
            //Call reverseofstring method
            ReverseofString(original);
        }
        public static void ReverseofString(String original)
        {
            //Take a empty reverse string
            String reverse="";
            //calculate the length of string and store it
            int length = original.length();
            //logic for reversing a string
            for (int i = length - 1 ; i >= 0 ; i--)
            {
                reverse = reverse + original.charAt(i);
            }
            //print the reverse number
            System.out.println("Reverse of the string: " + reverse);
        }
    }

