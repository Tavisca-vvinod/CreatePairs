import java.util.Arrays;

public class PairsMaker {
    public static int findPairsAndSingles(int[] ints) {
        int sum=0;
        int negativPositiveZero[]=findNegativesAndPostiviesAndZero(ints);
        Arrays.sort(ints);
        if(negativPositiveZero[0]%2==0)
        {
            for(int i = 0 ; i<negativPositiveZero[0];i++)
            {
                sum=sum+(ints[i]*ints[i+1]);
                i++;
            }
        }
        else
        {
            if(Arrays.binarySearch(ints,0)>=0)
            {
                for(int i=0; i<negativPositiveZero[0]-1;i++)
                {
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
            }
            else
            {
                for(int i=0; i<negativPositiveZero[0]-1;i++)
                {
                    sum=sum+(ints[i]*ints[i+1]);
                    i++;
                }
                sum=sum+ints[negativPositiveZero[0]-1];
            }
        }
        int postives[]=makePosArray(ints,negativPositiveZero[1]);
        if(negativPositiveZero[1]%2==0&&negativPositiveZero[1]!=0)
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
        else if(negativPositiveZero[1]!=0 && negativPositiveZero[1]%2!=0)
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
    public static int[] findNegativesAndPostiviesAndZero(int[] ints)
    {
        int negCount=0;
        int posCount=0;
        for(int i:ints)
        {
            if(i>0)
            {
                posCount++;
            }
            else if(i<0)
            {
                negCount++;
            }
        }
        return new int[]{negCount,posCount};
    }
}
