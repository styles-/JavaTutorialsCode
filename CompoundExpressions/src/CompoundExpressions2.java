public class CompoundExpressions2{
	public static void main(String[] args){
		int[] ages = {52, 28, 93, 16};
		char gradeLetters[] = {'A', 'B', 'C', 'D', 'F'};
		float[][] matrix = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}};
		System.out.println(ages[0]);
		System.out.println(gradeLetters[2]);
		System.out.println(matrix[1][2]);
		System.out.println(ages['\u0002']);
		ages[1] = 19;
		System.out.println(ages[1]);
	}
}