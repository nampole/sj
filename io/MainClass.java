package com.tinedge.sj.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;		
		OutputStream os = null;

		
		try {
		is = new FileInputStream("D:\\newtext.txt");	
		while (true) {
			int i = is.read();
			System.out.println("데이터 : "+i);
			if (i==-1) break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (is != null) is.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} // 읽기
		
		
		try {
		is = new FileInputStream("D:\\newtext.txt");				
		os = new FileOutputStream("D:\\oldtext.txt");	
//		String str = "오늘은 좋은날. ^^ good good day ~~";
		byte [] bs = new byte[5];
		while (true) {
			int count = is.read(bs);
			if (count == -1) {
				break;
			}
			os.write(bs, 0, count);
		}
						
		//str.getBytes();
		//os.write(bs);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (os != null) os.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}//쓰기
				
		}
		
	} // main 끝나는 부분
	
