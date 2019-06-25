import java.util.Scanner;

public class Repeatstring
{
    public static void main(String[] args)
    {
        //Ask user to enter a string
        System.out.print("Enter a string : ");
        Scanner scanner = new Scanner(System.in);
        String inp1 = scanner.nextLine();
        //ask user to enter a number
        System.out.println("Enter a number");
        int inp2=scanner.nextInt();
        System.out.print("Output1\t"+inp1);
        //Call the repeatsubstring method
        Repeatsubstring(inp1,inp2);


    }
    public static void Repeatsubstring(String input1,int input2)
    {
        int i,count=0,a;
        //calculate the string length
        a=input1.length();
        //iterate loop until we reach end after printing substring for n time
        while (count != input2)
        {
            //print the last n characters in string for n times
            for (i = a-input2; i < input1.length(); i++)
            {
                char c = input1.charAt(i);
                System.out.print(c);
            }
            count++;
        }
    }
}

