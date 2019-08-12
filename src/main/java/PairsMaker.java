import java.util.Arrays;
public class PairsMaker {
    public static int max(int a, int b)
    {
         int maxx= (a*b > a+b ) ? a*b :  a+b;
        return maxx;
    }
    public static int findPairsAndSingles(int[] numbers) {
        int sum=0;
        int negPos[]= findNegativesAndPositives(numbers);
        int noOfNeg=negPos[0];
        int noOfPos=negPos[1];
        Arrays.sort(numbers);
        if(noOfNeg%2==0) {
            for(int i = 0 ; i<noOfNeg;i++) {
                sum=sum+max(numbers[i],numbers[i+1]);
                i++;
            }
        }
        else {
            for(int i=0; i<noOfNeg-1;i++) {
                sum=sum+max(numbers[i],numbers[i+1]);
                i++;
            }
            if(Arrays.binarySearch(numbers,0)<0) {
                sum=sum+numbers[noOfNeg-1];
            }
        }
        if(noOfPos%2==0&&noOfPos!=0) {
            int firstPosNumber=numbers[numbers.length-noOfPos];
            int secPosNumber=numbers[numbers.length-noOfPos+1];
            sum=sum+max(firstPosNumber,secPosNumber);
            for(int i=numbers.length-noOfPos+2;i<numbers.length;i++) {
                sum=sum+max(numbers[i],numbers[i+1]);
                i++;
            }
        }
        else if(noOfPos!=0 && noOfPos%2!=0) {
            int firstPosNumber=numbers[numbers.length-noOfPos];
            sum=sum+firstPosNumber;
            for(int i=numbers.length-noOfPos+1;i<numbers.length;i++) {
                sum=sum+max(numbers[i],numbers[i+1]);
                i++;
            }
        }
        return sum;
    }
   public static int[] findNegativesAndPositives(int[] ints) {
        int negCount=0;
        int posCount=0;
        for(int i:ints) {
            if(i>0) {
                posCount++;
            }
            else if(i<0) {
                negCount++;
            }
        }
        return new int[]{negCount,posCount};
    }
}
