import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int inputvalue=sc.nextInt();
        sum_decreasingnumbers(inputvalue);
    }
    public static void sum_decreasingnumbers(int input)
    {
        int sumOfEven = 0;
        int len = Integer.toString(input).length();
        int[] arr = new int[len];
        //Spliting the number and placing each number into array
        for (int i = 0; i < len; i++)
        {
            arr[i] = input % 10;
            //finding the digit is even or odd, if it even add the number to sumOfEven
            if (arr[i] % 2 == 0)
            {
                sumOfEven = sumOfEven + arr[i];
            }
            input = input / 10;
        }
        //Sorting the number in arrays in ascending order(sort method by default ascending order)
        Arrays.sort(arr);
        int num = 0;
        for (int i = 0; i < len; i++)
        {
            //getting the Array elements in reverse order
            num = (num * 10) + arr[len - i - 1];

        }
        System.out.println("Sorted number in non-increasing order : " + num);
        System.out.println("Sum of even numbers :" + sumOfEven);
        //Check the condition for number greater or less than 15
        boolean VAR = (sumOfEven > 15) ? true : false;
        System.out.println("Sum of even digits is more than 15 : " + VAR);
    }
}
