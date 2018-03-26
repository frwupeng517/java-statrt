package io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream 读取文件
 * 读取方法：int read(byte[] b) 读取字节数组
 * 数组作用：缓冲的作用，提高效率
 * read 返回的int 表示的含义：读取到多少个有效的字节数
 *
 */
public class FileInputStream02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		// 创建字节数组
		byte[] b = new byte[1024];
		
		int len = 0;
		/*
		len = fis.read(b);
		System.out.println(len); // 12
		System.out.println(new String(b)); // aABCDCDhello + 1012个空格
		*/
		while((len = fis.read(b)) != -1) {
			System.out.println(new String(b, 0, len)); // aABCDCDhello
		}
		fis.close();
	}

}
