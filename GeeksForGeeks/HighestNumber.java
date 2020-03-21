package GeeksForGeeks;

public class HighestNumber
{
    static void highest(int a[], int low, int hight)
    {
        int i=0;
        while(i<hight)
        {
           if(a[i] <= a[i+1])
           {
               i++;
           }
           else
           {
               System.out.println("found at" +" " +a[i]);
               break;
           }
       }
    }
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 4};
        highest(arr, 0, arr.length);
    }
}
