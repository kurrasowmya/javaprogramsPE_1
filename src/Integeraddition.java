import java.util.Scanner;

public class Integeraddition
{
    public static void main(String[] args)
    {
        //Call the integersum method
        integersum();

    }
    public static void integersum()
    {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        //Ask user to enter count for numbers
        System.out.println("Enter count of numbers");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //Ask user to enter numbers
        System.out.println("Enter numbers");
        //write try to catch the exception of on-integer value
        try
        {
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == (int) arr[i]) {
                    sum = sum + arr[i];
                }
            }
        System.out.println("sum"+sum);
        }
        catch (Exception e)
        {
            System.out.println("you entered other than integer number");
        }
    }
}
