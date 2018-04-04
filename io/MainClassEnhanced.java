package com.tinedge.sj.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClassEnhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = null;		
		OutputStream os = null;
		DataInputStream dis = null;		
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\newtext.txt");	
			dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			os = new FileOutputStream("D:\\oldtext3.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);			
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		} finally {
			if (dos != null) {
			try {
				dos.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		} // 읽기
		
		if (os != null) {
				try {
					os.close();
				}
		 catch (Exception e2) {
			System.out.println(e2.getMessage());
		}				
		
		}}}} // main 끝나는 부분
	
