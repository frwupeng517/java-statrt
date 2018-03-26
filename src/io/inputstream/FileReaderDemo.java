package io.inputstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader(File file)
 * 
 * 读取的方法：read()
 * int read()：读取 1个字符
 * int read(char[] c)：读取字符数组
 *
 */
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("c:\\a.txt");
		
		/*
		int read = fr.read();
		System.out.println(read); // 97
		
		read = fr.read();
		System.out.println(read); // 65
		*/
		
		char[] c = new char[1024];
		int len = 0;
		while((len = fr.read(c)) != -1) {
			System.out.println(new String(c, 0, len));
		}
		fr.close();
	}

}
