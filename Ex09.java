package IO;

import java.util.*;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 홍길동 성춘향 이순신 이몽룡
		// Scanner를 사용하여 위 문자열을 입력 후
		// nextLine 메소드를 통해 입력한 문자열 읽어오기
		// String 클래스의 getBytes 메소드를 통해
		// 문자열을 byte 배열로 변환 후
		// 모든 공백을 , 로 변환하여 출력하기
		
		// 문자열 : 홍길동 성춘향 이순신 이몽룡
		// 변환 문자열 : 홍길동,성춘향,이순신,이몽룡
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = scan.nextLine();
		System.out.println("입력한 문자열 : "+str);
		
		byte[] barr=str.getBytes();
		for(int i =0; i<barr.length; i++) {
			if(barr[i]==' ') {
				barr[i]=',';
			}
		}
		
		String str2 = new String(barr);
		System.out.println("변환 후 문자열 : "+str2);
		
		String str3 = "홍길동 성춘향 이순신 이몽룡";
		String str4 = str3.replace(" ", ",");
		
		System.out.println("변환 다음 문자열 : "+str4);
	}

}
