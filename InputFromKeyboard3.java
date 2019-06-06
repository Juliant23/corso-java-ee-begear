package base;

import javax.swing.JOptionPane;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valoreImmesso = JOptionPane.showInputDialog("Prego immettere un valore : ");
		
		JOptionPane.showMessageDialog(null, "Hai immesso questo valore : " + valoreImmesso);

	}

}
