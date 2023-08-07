package IO;

import java.io.*;
public class Ex06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 자바에서 PrintStream 과 PrintWriter 는 출력스트림을
		// 처리하는 클래스이다. 이 두 클래스는 각각 바이트 기반 스트림과
		// 문자기반 출력 스트림을 처리하기 위해 사용된다.
		
		PrintStream ps = new PrintStream(System.out);
		
		// 기본 자료형과 문자열 추력
		ps.print("안녕하세요");
		ps.println(100);
		ps.println(3.14);
		ps.println(true);
		ps.printf("%d, %f, %c, %s", 100, 3.14, 'A', "Hello");
		//ps.close();
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Hello world");
		pw.println("오늘 좋은하루 되세요~!!");
		pw.flush();

	}

}
