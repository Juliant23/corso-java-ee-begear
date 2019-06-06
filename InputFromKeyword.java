package base;
import java.io.*;

public class InputFromKeyword {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("prego immetere un valore ...");
		String valoreImmesso = br.readLine();
		System.out.println("hai imesso questo valore : " + valoreImmesso);
		
		
		
		
	}

}
