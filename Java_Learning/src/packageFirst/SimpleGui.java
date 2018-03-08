package packageFirst;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class SimpleGui implements ActionListener{
	
	JButton button;

	//* testing123
	public static void main(String args[]) {
		
		SimpleGui SG = new SimpleGui();
		SG.go();
		
	}
		
		public void go() {
			
			JFrame frame =  new JFrame();
			button = new JButton("click me");
			button.addActionListener(this);
			
			frame.getContentPane().add(BorderLayout.SOUTH, button);
			//frame.getContentPane().add(BorderLayout.WEST,button);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300,300);
			frame.setVisible(true);
			
		}
		
		public void actionPerformed(ActionEvent event) { 
			button.setText("I ve been clicked!");
		}
		
	}

