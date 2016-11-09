
public class Bubble 
{
	//Following function will sort the array in Increasing (ascending) order
    void sort(int arr[])
    {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++)
        {
        	// Last i elements are already in place, so the inner loops will run until it reaches the last i elements
            for (int j = 0; j < n-i-1; j++)
            {
            	if (arr[j] > arr[j+1]) //To Sort in decreasing order, change the comparison operator to '<'
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    void modified_sort(int arr[])
    {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++)
        {
        	boolean flag = false; //Taking a flag variable
        	
        	// Last i elements are already in place
            for (int j = 0; j < n-i-1; j++)
            {
            	if (arr[j] > arr[j+1]) //To Sort in decreasing order, change the comparison operator to '<'
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    flag = true; //Setting the flag, if swapping occurs
                }
            }
            
            if(!flag) //If not swapped, that means the list has already sorted
            {
                break;
            }
        }
    }
}
