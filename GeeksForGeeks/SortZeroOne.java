package GeeksForGeeks;

public class SortZeroOne
{
    static void sortZeroOneArray(int a[], int n)
    {
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            while(a[left] == 0 && left<right)
            {
                left++;
            }
            while(a[right] == 1 && left<right)
            {
                right--;
            }
            if(left < right)
            {
                a[left] = 0;
                a[right] = 1;
                left--;
                right++;
            }
        }
        for(int i =0; i<n ; i++)
        {
            System.out.println("array is"+ " " + a[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] ={0,1,1,1,0,0,1,0,1,1};
        sortZeroOneArray(arr, arr.length);
    }
}
