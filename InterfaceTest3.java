
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	
	public MyFrame() {
		
		button = new JButton("My Button");
		
		setLayout(null);
		setVisible(true);
		setSize(500,500);
		
		button.setBounds(100,100,100,140);
		
		add(button);
		
		button.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		JOptionPane.showMessageDialog(null,"You clicked on Button");
		
	}
	
}


public class InterfaceTest3 {
	
	public static void main(String[] args) {
		
		new MyFrame();
		
	}
}