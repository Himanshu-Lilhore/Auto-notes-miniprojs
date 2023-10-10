
public class JaggedArray {

	public static void main(String[] args) {
		int data[][] = new int[3][];
		
		data[0] = new int[2];
		data[1] = new int[1];
		data[2] = new int[3];

		data[0][0] = 1;
		data[0][1] = 2;
		data[1][0] = 3;
		data[2][0] = 4;
		data[2][1] = 5;
		data[2][2] = 6;
		
		for(int[] i : data)
		{
			for(int j : i)
			{
				System.out.println(j);
			}
		}
	}

}
