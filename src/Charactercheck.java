import java.util.Scanner;

public class Charactercheck {
    public static void main(String[] args)
    {
        char n;
        //Ask user to enter a character
        System.out.print("Enter any character:");
        Scanner sc=new Scanner(System.in);
        n=sc.next().charAt(0);
        //Call charcheck method
        charcheck(n);
    }
    public static void charcheck(char m)
    {
        //Checking character for lowercase
        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        //Checking character for Uppercase
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        //Checking character for digit
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
        //if above conditions fail print it as special character
        else
        {
            System.out.println("special character");

        }
    }
}
