import java.util.Scanner;

public class Charcheck
{
    public static void main(String[] args) {
        int i;
        //Ask user to enter a string
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String Stringinput = scanner.nextLine();
        //Call consonantvowelcheck method
        consonantvowelcheck(Stringinput);
    }
    public static void consonantvowelcheck(String inputString)
    {
        int i;
        //check each and every character in the string
        for(i=0;i<inputString.length();i++)
        {
            char c=inputString.charAt(i);
            //if condition for vowel check
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.print(" "+"Vowel");
            }
            //if not vowel, print it as consonant
            else
            {
                System.out.print(" "+"Consonant");
            }
        }
    }
}
