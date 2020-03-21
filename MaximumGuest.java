package GeeksForGeeks;

import java.util.Arrays;

public class MaximumGuest
{
    static void findMaxGuests(int entry[], int exit[], int n)
    {
        int guest=1;
        int maxGuest = 0;
        int entryTime=entry[0];
        int i=1;
        int j=0;


        Arrays.sort(entry);
        Arrays.sort(exit);

        while(i<n && j<n)
        {
            if(entry[i] <= exit[j])
            {
                guest++;
                if(maxGuest<guest)
                {
                    maxGuest = guest;
                    entryTime=entry[i];
                }

                i++;
            }
            else{
                guest--;
                j++;
            }
        }
        System.out.println("Maximum Number of Guests = "+
                maxGuest + " at time " + entryTime);

    }
    public static void main(String[] args)
    {
        int arrl[] = {1, 2, 10, 5, 5};
        int exit[] = {4, 5, 12, 9, 12};
        int n = arrl.length;
        findMaxGuests(arrl, exit, n);
    }
}
