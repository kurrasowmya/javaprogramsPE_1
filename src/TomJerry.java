import java.util.Scanner;

public class TomJerry
{
    public static void main(String[] args)
    {
        int number;
        Scanner input=new Scanner(System.in);
        //Ask user to enter a number
        System.out.println("Enter a number");
        number=input.nextInt();
        //call the method evenoddcheck
        evenoddcheck(number);
    }
    public static void evenoddcheck(int num)
    {
        //If number is even and between 20 and 30, print Jerry
        if(num%2==0 && num>=20 && num<=30)
        {
            System.out.println("Jerry");
        }
        //If number is odd and between 20 and 30, print Tom
        if(num%2!=0 && num>=20 && num<=30)
        {
            System.out.println("Tom");
        }
    }
}
