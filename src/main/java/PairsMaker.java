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
            for(int i=0; i<negativPositiveZero[0]-1;i++)
            {
                sum=sum+(ints[i]*ints[i+1]);
                i++;
            }
            if(Arrays.binarySearch(ints,0)<0)
            {
                sum=sum+ints[negativPositiveZero[0]-1];
            }
        }
        if(negativPositiveZero[1]%2==0&&negativPositiveZero[1]!=0)
        {
            if(ints[ints.length-negativPositiveZero[1]]*ints[ints.length-negativPositiveZero[1]+1]>ints[ints.length-negativPositiveZero[1]]+ints[ints.length-negativPositiveZero[1]+1])
            {
                sum=sum+ints[ints.length-negativPositiveZero[1]]*ints[ints.length-negativPositiveZero[1]+1];
            }
            else
            {
                sum=sum+ints[ints.length-negativPositiveZero[1]]+ints[ints.length-negativPositiveZero[1]+1];
            }
            for(int i=ints.length-negativPositiveZero[1]+2;i<ints.length;i++)
            {
                sum=sum+ints[i]*ints[i+1];
                i++;
            }
        }
        else if(negativPositiveZero[1]!=0 && negativPositiveZero[1]%2!=0)
        {
            sum=sum+ints[ints.length-negativPositiveZero[1]];
            for(int i=ints.length-negativPositiveZero[1]+1;i<ints.length;i++)
            {
                sum=sum+(ints[i]*ints[i+1]);
                i++;
            }
        }
        System.out.print(sum);
        return sum;
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
