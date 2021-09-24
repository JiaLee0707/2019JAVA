
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		String strData1 = "I LOVE MIRIM MEISTER";
		int length =strData1.length();
		System.out.println("1. "+length);
		
		//2
		String str = "I LOVE MIRIM MEISTER";
		System.out.print("2. ");
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		//String 할당된 값을 변경하지 못함(새로 생성함)
		//StringBuffer 값을 변경가능
		
		//3
		String R1 = new String("JAVA");
		String R2 = new String("JAVA");
		String R3 = new String("java");
		
		System.out.println("3. ");
		System.out.println("R1==R2 --> "+ (R1==R2)); 
		System.out.println("R1.equals(R2) --> "+R1.equals(R2));
		System.out.println("R1==R3 --> "+R1.equals(R3));
		System.out.println("R1.equals(R3) --> "+R1.equals(R3));
		
		//4
		char ch = 'A';
		String strData1_ = "A";
		String strData2_4 = String.valueOf(ch);
		if(strData1.equals(strData2_4)) {
			System.out.println("4. 같음");
		}
		else {
			System.out.println("4. 다름");
		}
		
		//5
		String strData1_5 = "I LOVE MIRIM MEISTER ";
		String strData2_5 = strData1_5.trim();
		System.out.println("5. "+strData1_5.equals(strData2_5));
		
		//6
		String strData1_6 = "I LOVE MIRIM MEISTER";
		String strData3_6 = strData1_6.substring(7, 12);
		System.out.println("6. "+strData3_6);
		
		//7
		String strData1_7 = "I LOVE MIRIM MEISTER";
		String strData4_7 = strData1_7.substring(2,5);
		System.out.println("7. "+strData4_7);
		
		//9
		StringBuffer sb1 = new StringBuffer("java programming");
		StringBuffer sb2 = new StringBuffer("project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" project");
		str2 = sb1.append(sb2);
		System.out.println("9. ");
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		
		//10
		StringBuffer sb1_10 = new StringBuffer("java programming");
		StringBuffer sb2_10 = null;
		sb2_10 = sb1_10.replace(0,4,"JAVA"); 
		System.out.println("10. sb2_10 = "+sb2_10);
		
		//11
		StringBuffer sb1_11 = new StringBuffer("java programming");
		StringBuffer sb3 = null;
		sb3 = sb1_11.reverse();
		System.out.println("11. sb3 = "+sb3);
		
		//12
		//toUpperCase는 String클래스의 메소드 그렇기 때문에 String으로 바꿔서 하는거.
		StringBuffer sb1_12 = new StringBuffer("java Programming");
		String str_12 = null;
		str_12 = sb1_12.toString();
		System.out.println("12. str_12.toUpperCase() = "+str_12.toUpperCase());
		
		//13
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("13.");
		System.out.println("in1.equals(in2) -->"+(in1.equals(in2)));
		System.out.println("in1.equals(in3) -->"+(in1.equals(in3)));
		
		//14
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		int i=100;
		double d=55.7;
		System.out.println("14.\n"+Integer.toString(i)+Double.toString(d));
		System.out.println(wrapi.toString()+wrapd.toString());
		
		//15
		String stri="123456";
		String strd="123.56";
		System.out.println("15.\n"+Integer.valueOf(stri));
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri)+Double.valueOf(strd));
		
		//16
		String a="10", b="20";
		int sum=0;
		float average=0;
		System.out.println("16. ");
		System.out.println("input data : "+a+" "+b);
		int c = Integer.parseInt(a);
		int d_16 = Integer.parseInt(b);
		sum = c+d_16;
		average =sum/2;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println("평균 = "+average);
		
		//17
		//18
		//19
		
		//20
		System.out.println("20. ");
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		
		//21
		System.out.println("21. ");
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)Math.random()*5);
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*1000));
	}
}
