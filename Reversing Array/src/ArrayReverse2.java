import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse2

    /*
      This Java program reverses an array by using recursion

      arr = {2, 4, 6, 8}

      revarr = {8, 6, 4, 2}


     */ {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = input.nextInt();

        //Declare an array
        int[] arr = new int[n];

        System.out.println("Enter array values: ");

        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        //Reverse an array
        reverse(arr, n - 1);

        System.out.println("Array reversed");
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void reverse(int arr[], int n)
    {
        //start = 0, end = 4 -> (n - 1)
        //arr = {2, 4, 6, 8}

        int temp;
        int start = 0;
        int end = n;

        while (start <= end)
        { //condition used so the start and end elements will loop through the array as long as this is true

            temp = arr[start]; //2

            arr[start] = arr[end]; //8
            arr[end] = temp; //2

            start++; //loops though from the beginning to the end until they meet in the middle
            end--;  //loops through from the end to the beginning until they meet in the middle

        }

    }

}





