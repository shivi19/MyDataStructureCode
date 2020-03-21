package GeeksForGeeks;

public class TwoWayMerge
{

    static void merge(int a[], int b[], int n, int m)
    {
        int c[] = new int[n+m-1];
        int i=0;
        int j=0;
        int k=0;
        while(i < n &&  j < m)
        {
            if (a[i] < b[j])
            {
                c[k] = a[i];
                k++;
                i++;
            }
            else
            {
                c[k] = b[j];
                k++;
                j++;
            }

        }
        if (n > m)
        {
            for (; i < n; i++)
            {
                c[k] = a[i];
            }
        }
        else
        {
            for (; j < m; j++)
            {
                c[k] = b[j];
            }
        }
        for(int s=0; s<c.length; s++)
        {
            System.out.println("array merged" +" " +c[s]);
        }
    }
    public static void main(String args[])
    {
        int a[] ={2,8,15,18};
        int b[] = {5, 9, 12, 17, 19,22};

        merge(a, b, a.length, b.length);

    }
}
