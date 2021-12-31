import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


class MyFrame extends JFrame {
	
	
	JPanel panel;
	
	
	MyFrame() {
		
		setLayout(null);
		setVisible(true);
		
		
		setSize(500,500);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(50,50,250,250);
		panel.setBackground(Color.RED);
		
		//panel.setBorder(BorderFactory.createTitledBorder("Hello"));
		//panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		//panel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		panel.setBorder(BorderFactory.createEtchedBorder());
		//panel.setBorder(BorderFactory.createRaisedBevelBorder());
		
		//panel.setBorder(BorderFactory.createCompoundBorder());
		add(panel);
	}
	
	
}



public class FactoryTest {
	
	public static void main(String args[]) {
		
		new MyFrame();
	}
	
}

