
class MultidimentionalArray {
	public static void main (String[] args) {
//	    Scanner sc = new Scanner(System.in);
	    
		int[][] marks = new int[2][2];
		marks[0][0] = 1;
		marks[0][1] = 2;
		marks[1][0] = 3;
		marks[1][1] = 4;
		for(int[] i: marks)
		{
		    for(int j : i)
		    {
		        System.out.println(j);
		    }
		}
	}
}