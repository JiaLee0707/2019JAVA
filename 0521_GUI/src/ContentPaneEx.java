import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame {

	ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // 컨텐트팬 알아내기
		c.setBackground((Color.ORANGE)); // 오렌지색 배경 설정
		c.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLaylout
		
		c.add(new JButton("OK")); // OK 버튼 달기
		c.add(new JButton("Cancel")); // Cancel 버튼 달기
		c.add(new JButton("Ignore")); // Ignore 버튼 달기
		//add(new JButton("Click"));
		
		setSize(300, 150); // 프레임 크기 300x150 설정
		setVisible(true); // 화면에 프레임 출력
	}
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
