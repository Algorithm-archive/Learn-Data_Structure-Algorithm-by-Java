public class Selection 
{
	//Following function will sort the array in Increasing (ascending) order
    void sort(int arr[])
    {
        int i, j, tmp, current_Min;

        /* advance the position through the entire array */
        /*   (could do i < n-1 because single element is also min element) */
        for (i = 0; i < n-1; i++)
        {
            // find the min element in the unsorted a[i .. n-1]

            current_Min = i; // assume the min is the first element
            // test against elements after i to find the smallest
            for ( j = i+1; j < n; j++)
            {
                // if this element is less, then it is the new minimum
                if (arr[j] < arr[current_Min]) //To sort in decreasing order just change the comparison operator to '>'
                {
                    current_Min = j; // found new minimum; remember its index
                }
            }

            if(current_Min != i) //if the current_Min is equal to i, then it is in right position already
            {
                //Swap the values
                tmp = arr[i];
                arr[i] = arr[current_Min];
                arr[current_Min] = tmp;
            }
        }
    }
}
