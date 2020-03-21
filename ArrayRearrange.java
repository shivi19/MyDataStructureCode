package GeeksForGeeks;

public class ArrayRearrange
{
    static void arrnge(int a[], int n)
    {
        int left = 0;
        int right = n-1;
        while(left < n-1 && right > 0 )
        {

            int s = a[left];
            a[left] = a[right];
            a[right] = s;
            left++;
            right--;
        }
        for(int i=0; i<n; i++)
        {
            System.out.println("arrays is"+" "+a[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] ={10, 20,30, 40, 50, 60, 70, 80, 90, 100, 110};
        arrnge(arr, arr.length);
    }
}
