import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        //declare a long number
        long number;
        Scanner input=new Scanner(System.in);
        //ask user to enter a number
        System.out.println("enter the number");
        number=input.nextLong();
        palindromeandgreater(number);

    }
    public static void palindromeandgreater(long num)
    {
        long a,temp,sum=0,evensum=0;
        temp=num;
        while(num!=0)
        {
            a=num%10;
            //digit is checked for even number to get evensum
            if(a%2==0)
            {
                evensum=evensum+a;
            }
            sum=sum*10+a;
            num=num/10;
        }
        //if-else to compare the original number with reversed number
        if(sum==temp)
        {
            //check whether the evensum is greater or less than 25
            if(evensum>25)
            {
                System.out.println(temp+ "is palindron and sum of even numbers is greater than 25");
            }
            else
            {
                System.out.println(temp+ "is palindron and sum of even numbers is less than 25");
            }
        }
        else
        {
            System.out.println(temp+ "is not a palindrom");
        }
    }
}
