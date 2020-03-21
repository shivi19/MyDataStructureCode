package GeeksForGeeks;

import java.util.HashMap;
import java.util.Map;

public class Majority
{
    static void equi(int a[], int n)
    {
        Map<Integer, Integer> equiMap = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(equiMap.containsKey(a[i]))
            {
                int count  = equiMap.get(a[i])+1;
                if(count>n/2)
                {
                    System.out.println("majority found "+ a[i]);
                    return;
                }
                else
                {
                    equiMap.put(a[i], count);
                }

            }
            else
            {
                equiMap.put(a[i], 1);
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 3, 1, 3, 3, 2,1,1,1,1,1,1};
        equi(arr, arr.length);
    }
}

