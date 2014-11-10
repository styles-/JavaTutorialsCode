public class OddTriangle{
	public static void main(String[] args){
		for (int i = 1; i <= 10; i++){
			for (int k = 10-i; k > 0; k--)
				System.out.print(" ");
			for (int j = 1; j < i*2; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("         *");
		System.out.println("         *");
		System.out.println("         *");
	}
}