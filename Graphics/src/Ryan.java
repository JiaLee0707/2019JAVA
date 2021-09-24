import javax.swing.*;
import java.awt.*;

public class Ryan extends JFrame {
	private MyPanel panel = new MyPanel();
	public Ryan() {
		setTitle("Ryan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(750, 750);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//蓖
			g.setColor(Color.ORANGE);
			g.fillOval(210,80,90,90);
			g.setColor(Color.ORANGE);
			g.fillOval(430,80,90,90);
			
			//倔奔
			g.setColor(Color.ORANGE);
			g.fillOval(165,100,400,390);
			
			//传界
			g.setColor(Color.BLACK);
			g.fillRoundRect(245,210,85,18,20,20);
			g.setColor(Color.BLACK);
			g.fillRoundRect(400,210,85,18,20,20);
			
			//传
			g.setColor(Color.BLACK);
			g.fillOval(280,249,30,30);
			g.setColor(Color.BLACK);
			g.fillOval(422,249,30,30);
			
			//内, 涝
			g.setColor(Color.WHITE);
			g.fillOval(310,322,60,55);
			g.setColor(Color.WHITE);
			g.fillOval(360,322,60,55);
			
			g.setColor(Color.BLACK);
			g.fillOval(351,310,30,30);

		}
	}	
	public static void main(String [] args) {
		new Ryan();
	}
}
