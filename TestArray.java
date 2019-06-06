package base;
import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ar1 = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0 ; i < ar1.length ; i++) {
			System.out.println("Il valore è  " + ar1[i]);
		}
		
		Arrays.sort(ar1);

	}

}
