import java.util.Scanner;

public class Randomcheck
{
    public static void main(String[] args)
    {
        int originalnumber;
        //read a random number having limit 1 to 50 into a variable
        originalnumber=(int)(Math.random() *49 +1);
        Scanner sc=new Scanner(System.in);
        //Ask user to guess the random number
        System.out.println("Enter your guess");
        int guess=sc.nextInt();
        //Call checksecretnumber method
        checksecretnumber(guess,originalnumber);

    }
    public static void checksecretnumber(int guess,int secretnumber)
    {
        Scanner input=new Scanner(System.in);
        //Iterate loop until we get the secretnumber
        while(true)
        {
            //Check whether the number matches or not
            if(guess==secretnumber)
            {
                System.out.println("Number guessed matches the original number");
                break;
            }
            //if it is more than secretnumber, print message and again ask user to enter next guess
            else if(guess>secretnumber)
            {
                System.out.println("Number guessed is more than original number");
                System.out.println("enter your guess");
                guess=input.nextInt();
            }
            //if it is less than secretnumber, print message and again ask user to enter next guess
            else
            {
                System.out.println("Number guessed is less than original number");
                System.out.println("enter your guess");
                guess=input.nextInt();
            }

        }
    }
}
