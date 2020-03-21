package GeeksForGeeks;

public class BnarySearch
{
    static void binarySearch(int a[], int low, int h, int n)
    {
        int search = 20;
        int mid = (low+h)/2;
        if(h>=low)
        {
            if (a[mid] == search)
            {
                System.out.println("found at " + mid);
            }
            if (a[mid] > search)
            {
                binarySearch(a, low, mid-1, n);
            }
            else
            {
                binarySearch(a, mid+1, h, n);
            }
        }
    }
    public static void main(String[] args)
    {
        int arrl[] = {1, 2, 10, 15,17, 20, 22};
        binarySearch(arrl, 0, arrl.length-1, arrl.length);

    }
}
