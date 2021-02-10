public class ArrayReverse
{
    public static void main(String[] args)
    {
        int[] arr = {5, 10, 15, 20};
        reverse(arr, arr.length);
    }

    public static void reverse(int[] a, int l)
    {
        int[] b = new int[l]; //new array used for reversing the old array
        int j = l;

        for(int i = 0; i < l; i++)
        {
            b[j - 1] = a[i]; //assigns the "arr" array to a new array in reverse order
            j = j - 1; //assigns the new end length value to "j" and works its way backwards
        }

        for(int k = 0; k < l; k++)
        {
            System.out.println(b[k]); //prints out the new array in reverse order
        }
    }
}
