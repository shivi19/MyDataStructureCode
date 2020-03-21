package GeeksForGeeks;

public class StreamBinary
{
    static int searchOne(int a[], int l, int h, int n)
    {

        while(l<=h)
        {
            int mid = (l+h)/2;
            if (a[mid] == 1 &&
                    (mid == 0 || a[mid - 1] == 0))
                return mid;
//            if (a[mid] == 1)
//            {
//                return mid;
//            }
            else if (a[mid] == 1 && a[mid - 1] == 1)
            {
                h = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return -1;

     }
  public static void main(String args[])
  {
      int arr[] = { 1, 1, 1, 1, 1, 1 };
      int rest = searchOne(arr, 0, arr.length-1, arr.length);
      System.out.println("mid "+rest);
  }
}
