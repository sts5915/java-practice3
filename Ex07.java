package IO;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream input = System.in;
		
		//2부터 9까지 수 중 하나를 입력받아 해당하는 숫자의 구구단 출력하기
		System.out.print("2부터 9 사이의 숫자를 입력해주세요 : ");
		int code = input.read();
		// 2의 코드값 :50 ~ 9의 코드값 57
//		System.out.println(code);
		int dan = code-48;
//		System.out.println(dan);
		
		if(dan<2||dan>9) {
			System.out.println("2부터 9사이의 숫자를 입력해주세요");
			System.exit(0); // 프로그램 강제종료
		}
		System.out.println(dan + "단 출력");
		for(int i=2; i<10; i++) {
			System.out.printf("%dX%d = %d\n",dan, i, dan*i);
		}
		
		

	}

}
