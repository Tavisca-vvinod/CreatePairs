import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

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
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
            }
            else
            {
                for(int i=0; i<numberOfNegatives-1;i++)
                {
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
                sum=sum+ints[numberOfNegatives-1];
            }
        }
        int numberOfPositives=findPostivies(ints);
        int postives[]=makePosArray(ints,numberOfPositives);
        if(numberOfPositives%2==0&&numberOfPositives!=0)
        {
            if(postives[0]*postives[1]>postives[0]+postives[1])
            {
                sum=sum+postives[0]*postives[1];
            }
            else
            {
                sum=sum+postives[0]+postives[1];
            }
            for(int i=2;i<postives.length;i++)
            {
                sum=sum+postives[i]*postives[i+1];
                i++;
            }
        }
        else if(numberOfPositives!=0 && numberOfPositives%2!=0)
        {
            sum=sum+postives[0];
            for(int i=1;i<postives.length;i++)
            {
                sum=sum+(postives[i]*postives[i+1]);
                i++;
            }
        }
        System.out.print(sum);
        return sum;
    }
    public static int[] makePosArray(int[] ints, int number)
    {
        int [] pos=new int[number];
        int j=0;
        for(int i=ints.length-number;i<ints.length;i++)
        {
            pos[j]=ints[i];
            j++;
        }
        return pos;
    }
    public static int findPostivies(int[] ints)
    {
        int count=0;
        for(int i:ints)
        {
            if(i>0)
            {
                count++;
            }
        }
        return count;
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
