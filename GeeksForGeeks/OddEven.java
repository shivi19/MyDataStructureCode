package GeeksForGeeks;

public class OddEven
{
    static void oddEven(int a[], int n)
    {
        int even =0;
        int odd = 1;
        while(true)
        {
            while (even < n && a[even] % 2 == 0)
            {
                even = even + 2;
            }
            while (odd < n && a[odd] % 2 == 1)
            {
                odd = odd + 2;
            }
            if (even < n && odd < n)
            {
                int temp = a[even];
                a[even] = a[odd];
                a[odd] = temp;
            }
            else
            {
                return;
            }

        }
    }
    public static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String args[])
    {
        int arr[] = {3, 6, 12, 1, 5, 8};
        oddEven(arr, arr.length);
        printArray(arr, arr.length);
    }
}
