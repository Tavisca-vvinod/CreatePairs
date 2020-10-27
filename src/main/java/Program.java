public class Program {
    public static void main(String[] args) {
        System.out.println(PairsMaker.findPairsAndSingles( new int[] {0, 1, 2, 4, 3, 5})==27? "PASS":"FAIL");
        System.out.println(PairsMaker.findPairsAndSingles( new int[] {-1, 1, 2, 3})==6? "PASS":"FAIL");
        System.out.println(PairsMaker.findPairsAndSingles( new int[] {-1})==-1? "PASS":"FAIL");
        System.out.println(PairsMaker.findPairsAndSingles( new int[] {-1, 0, 1})==1? "PASS":"FAIL");
        System.out.println(PairsMaker.findPairsAndSingles( new int[] {1,1})==2? "PASS":"FAIL");
		//change
    }
}
