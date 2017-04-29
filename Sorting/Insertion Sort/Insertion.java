/* Insertion sort implementation in Java */

public class Insertion
{
	//Following function will sort the array in Increasing (ascending) order
    void sort(int arr[])
    {
        int i, current_value, j;

        int n = arr.length;

        for (i = 1; i < n; i++)
        {
            current_value = arr[i];
            j = i-1;

            /* Move elements of arr[0..i-1], that are
                greater than current_value, to one position ahead
                of their current position */
            while (j >= 0 && arr[j] > current_value)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current_value;
        }
    }
}
