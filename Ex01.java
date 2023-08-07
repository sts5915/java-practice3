package IO;

import java.io.*;
public class Ex01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 컴퓨터의 키보드, 파일, 네트워크 등으로 입력을 하여
		// 컴퓨터의 메모리에 저장되면 콘솔, 파일, 네트워크 등을 통해 출력
		// 데이터들은 2진수로 이루어진 바이트로 전달이 되어진다.
		// 이러한 입출력을 실행하기 위해서 자바에서는 Stream이 사용된다
		
		InputStream input = System.in;
		// InputStream 은 1바이트 처리 스트림이다.
		// 영어 대소문자, 숫자, 특수문자만 처리할 수 있다. 한글 처리 x
		
		System.out.print("키코드 입력하고 엔터 : ");
		
		
		int keyCode = input.read();
		System.out.println("keyCode : " +(char) keyCode);
		
		keyCode = input.read(); //엔터값 읽어오기
		System.out.println("keyCode : " + keyCode);
		
		keyCode = input.read(); // 엔터값 읽어오기
		System.out.println("keyCode : " + keyCode);
	}

}
