package IO;

import java.io.*;
public class Ex05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		// 2byte 처리 스트림
		osw.write(44032);
		osw.flush();

	}

}
