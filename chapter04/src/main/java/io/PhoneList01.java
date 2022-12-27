package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			File file = new File("phone.txt");
			
			System.out.println("======= 파일정보 =======");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
	
			System.out.println("======= 전화번호 =======");
		
			//1. 기반스트림(FileInputStream)
			FileInputStream fis = new FileInputStream(file);
			
			//2. 보조스트림1(byte|byte|byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");

			//3. 보조스트림2(char1|char2|char3|char4|\n -> "char1char2char3char4")
			new BufferedReader(isr);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error:" + e);
		} finally {
			br.close();
		}
		
	}

}