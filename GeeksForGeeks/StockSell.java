package GeeksForGeeks;

public class StockSell
{
    static void stockSell(int arr[], int n)
    {
        int buyPrice = arr[0];
        int sellPrice =0;
        for(int i=1; i<n; i++)
        {
            if(arr[i] > buyPrice)
            {
               sellPrice = arr[i];
               System.out.println("sell price" +sellPrice);
            }
            if(arr[i] < sellPrice)
            {
                buyPrice = arr[i];
                System.out.println("buy price" +buyPrice);

            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,6,3,5,4,6,7};
        stockSell(arr, arr.length);

    }
}
