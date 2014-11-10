public class DumpMatrix{
	public static void main(String[] args){
		float[][] matrix = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}};
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[row].length; col++)
				System.out.print(matrix[row][col] + " ");
			System.out.print("\n");
		}
	}
}