import java.io.*;
import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File dest = new File("Phone.txt");
		System.out.println("��ȭ��ȣ �Է����α׷��Դϴ�.");
		int c;
		try {
			FileWriter fw = new FileWriter(dest);
			while(true) {
				System.out.println("name PhoneNumber>>");
				String line = sc.nextLine();
				if(line.equals("�׸�")) {
					break;
				}
				fw.write(line+"\r\n"); //Phone.txt�� ���� ���
			}
			sc.close();
			fw.close();
			System.out.println("�Է¹��� ������ " + dest.getPath()+ "�� �����Ͽ����ϴ�.");
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
