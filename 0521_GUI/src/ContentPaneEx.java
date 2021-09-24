import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame {

	ContentPaneEx() {
		setTitle("ContentPane�� JFrame ����"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); // ����Ʈ�� �˾Ƴ���
		c.setBackground((Color.ORANGE)); // �������� ��� ����
		c.setLayout(new FlowLayout()); // ����Ʈ�ҿ� FlowLaylout
		
		c.add(new JButton("OK")); // OK ��ư �ޱ�
		c.add(new JButton("Cancel")); // Cancel ��ư �ޱ�
		c.add(new JButton("Ignore")); // Ignore ��ư �ޱ�
		//add(new JButton("Click"));
		
		setSize(300, 150); // ������ ũ�� 300x150 ����
		setVisible(true); // ȭ�鿡 ������ ���
	}
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
