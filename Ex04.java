package IO;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		// 1byte 처리 스트림
		
		// InputStreamReader는 InputStream 보다 향상된 처리 스트림이다
		// InputStream 달리 InputStreamReader는
		// 2바이트를 처리할 수 있기 때문에 한글도 처리 가능하다
		
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		// 2byte 처리 스트림
		
		System.out.print("하나의 문자를 입력 : ");
		int code = isr.read();
		// 한글의 코드값도 읽어올 수 있다.
		System.out.println("Code : "+code);
		char ch = (char)code;
		System.out.println("Char : "+ ch);
		

	}

}
