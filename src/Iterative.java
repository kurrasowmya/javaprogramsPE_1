import java.util.Scanner;

public class Iterative
{
    public static void main(String[] args)
    {
        int num;
        Scanner input= new Scanner(System.in);
        //Ask user to enter a number
        System.out.println("Enter a number");
        num=input.nextInt();
        //Call the numberrepeat method
        numberrepeat(num);

    }
    public static void numberrepeat(int n)
    {
        int i,j;
        //print the number n for n number of times from 1 to n
        for(i=1;i<n+1;i++)
        {
            for(j=0;j<n;j++)
            {
                while(i!=j&&i>=j)
                {
                    System.out.println(i);
                    j++;
                }
            }
        }
    }
}
