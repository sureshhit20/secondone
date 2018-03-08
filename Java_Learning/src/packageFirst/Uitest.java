package packageFirst;

import javax.swing.JOptionPane;

public class Uitest {
	
	public static void main(String args[]) {
		
		String fn = JOptionPane.showInputDialog("first");
		String ln = JOptionPane.showInputDialog("second");

		
		int first = Integer.parseInt(fn);
		int second = Integer.parseInt(ln);
		
		int sum = first + second;
		
		JOptionPane.showMessageDialog(null, "answer is " + sum);
	}

}
