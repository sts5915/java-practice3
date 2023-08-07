package IO;

import java.io.*;
public class Ex03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		InputStream input = System.in;
		byte[] datas = new byte[100];
		// 길이가 100인 byte 타입 배열생성
		
		System.out.print("이름 입력 : ");
		int nameLength = input.read(datas);
		// 입력한 내용의 길이를 정수로 반환한다
		
		
		String str = new String(datas, 0, nameLength-2);
		// 입력의 마지막에 줄바꿈 코드의 캐리지 리턴 코드를 제외하기 위해
		// nameLength-2를 사용
		
		System.out.println(str);
		
		System.out.print("하고 싶은 말 : ");
		// InputStream 의 read 메소드를 통해 입력을 받은 후
		// 입력한 내용을 콘솔뷰에 출력하기
		int commentLength = input.read(datas);
		String comment =  new String(datas, 0, commentLength-2);
		System.out.println(comment);
		
		
	}

}
