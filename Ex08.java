package IO;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// next : 공백전까지 입력한 문자열
		// nextInt : 공백전까지 입력한 정수
		// nextDouble : 공백전까지 입력한 실수
		// nextLine : 공백포함 전체 통 문자열
		
//		String number = "100";
//		int num = Integer.parseInt(number);
//		System.out.println(num);
//		 내부적으로 스캐너가 위 과정을 거치게 된다
		System.out.print("문자열 입력 : ");
		String str = scan.next();
		System.out.println(str);
		
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		System.out.println(a);
		
		System.out.print("실수 입력 : ");
		double b = scan.nextDouble();
		System.out.println(b);
		
		scan.nextLine(); //엔터값 처리
		
		System.out.print("공백 포함 문자열 입력 : ");
		String str2 = scan.next();
		System.out.println(str2);

	}

}
