import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Calculator extends JFrame{
	public Calculator() {
		setTitle("engineering calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(7, 5);
		String btnValue[] = {"x²", "x^y", "sin", "cos", "tan",
				"√", "10^x", "log", "Exp", "Mod",
				"↑", "CE", "C", "지우기", "/",
				"π", "7", "8", "9", "X",
				"n!", "4", "5", "6", "-",
				"±", "1", "2", "3", "+",
				"(", ")", "0", ".", "="};
		
		/*c.setLayout(grid);
		c.add(new JButton("x²"));
		c.add(new JButton("x^y"));
		c.add(new JButton("sin"));
		c.add(new JButton("cos"));
		c.add(new JButton("tan"));
		
		c.add(new JButton("√"));
		c.add(new JButton("10^x"));
		c.add(new JButton("log"));
		c.add(new JButton("Exp"));
		c.add(new JButton("Mod"));
		
		c.add(new JButton("↑"));
		c.add(new JButton("CE"));
		c.add(new JButton("C"));
		c.add(new JButton("지우기"));
		c.add(new JButton("/"));
		
		c.add(new JButton("π"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("X"));
		
		c.add(new JButton("n!"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("-"));
		
		c.add(new JButton("±"));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("+"));
		
		c.add(new JButton("("));
		c.add(new JButton(")"));
		c.add(new JButton("0"));
		c.add(new JButton("."));
		c.add(new JButton("="));*/
		
		c.setLayout(grid);
		for(int i=0; i<btnValue.length; i++) {
			c.add(new JButton(btnValue[i]));
		}
		setSize(700, 800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
