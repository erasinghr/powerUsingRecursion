package powerUsingRecursion;

public class PowerRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultFinal = RecursivePower(9,3);
		System.out.println(resultFinal);
	}

	private static int RecursivePower(int n, int p) {
		// TODO Auto-generated method stub
		if(p==0){
		       return 1; 
		    }
		int result = n * RecursivePower(n, p-1);
		return result;
	}

}
