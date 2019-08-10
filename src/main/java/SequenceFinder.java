import java.sql.SQLOutput;
import java.util.Arrays;

public class SequenceFinder {
    public static int findSequence(int[] ints) {
        int sum=0;
        int numberOfNegatives=findNegatives(ints);
        Arrays.sort(ints);
        if(numberOfNegatives%2==0)
        {
            for(int i = 0 ; i<numberOfNegatives;i++)
            {
                sum=sum+(ints[i]*ints[i+1]);
                i++;
            }
        }
        else
        {
            if(Arrays.binarySearch(ints,0)>=0)
            {
                for(int i=0; i<numberOfNegatives-1;i++)
                {
                    System.out.println("inside");
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
            }
            else
            {
                for(int i=0; i<numberOfNegatives-1;i++)
                {
                    System.out.println("inside");
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
                sum=sum+ints[numberOfNegatives-1];
            }
        }
        System.out.print(sum);
        return sum;
    }
    public static int findNegatives(int[] ints)
    {
        int count=0;
        for(int i:ints)
        {
            if(i<0)
            {
                count++;
            }
        }
        return count;
    }
}
