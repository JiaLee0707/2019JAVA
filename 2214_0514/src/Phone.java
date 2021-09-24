import java.io.*;
import java.util.Scanner;

public class Phone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File dest = new File("Phone.txt");
		System.out.println("전화번호 입력프로그램입니다.");
		int c;
		try {
			FileWriter fw = new FileWriter(dest);
			while(true) {
				System.out.println("name PhoneNumber>>");
				String line = sc.nextLine();
				if(line.equals("그만")) {
					break;
				}
				fw.write(line+"\r\n"); //Phone.txt에 문자 출력
			}
			sc.close();
			fw.close();
			System.out.println("입력받은 내용을 " + dest.getPath()+ "로 복사하였습니다.");
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
