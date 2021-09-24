import java.io.*;
public class InputExam {

	public static void streamTest(InputStream is) {
		try {
			while(true) {
				int i = is.read();  //InputStream에서 한 바이트를 읽는다.
				if(i == -1) break;
				char c = (char)i; //마지막에 Ctrl + Z입력시 종료
				System.out.print(c);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		streamTest(System.in); //InputExam.streamTest(System.in)
	}
}