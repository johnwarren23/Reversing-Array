import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse3
{
    public static void main(String[] args)
    {
        Integer[] arr = {2, 5, 12, 31, 45};
        {

            System.out.println(Arrays.asList(arr)); //prints out the original array
            Collections.reverse(Arrays.asList(arr)); //this class reverses the array
            System.out.println(Arrays.asList(arr)); //prints out the array in reversed order
        }
    }
}


