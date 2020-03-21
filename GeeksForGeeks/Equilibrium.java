package GeeksForGeeks;

public class Equilibrium
{
    static void equi(int a[], int n)
    {
        int sum =0;
        int leftSum =0;
       for(int i =0; i<n; i++)
       {
          sum = sum+a[i];
       }
       for(int j=0; j<n;j++)
       {
           leftSum = sum - a[j];
           if(leftSum == sum)
           {
               System.out.print("found");
           }
       }

    }
    public static void main(String[] args)
    {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        equi(arr, arr_size);
    }
}
