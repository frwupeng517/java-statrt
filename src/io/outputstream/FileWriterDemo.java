package io.outputstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 写的方法：
 * write(int c)：写一个字符
 * write(char[] c)：写入一个字符数组
 * write(char[] c, int off, int len)：写入字符数组的一部分
 * write(String str)：写一个字符串
 * write(String str, int off, int len)：写一个字符串的一部分
 * 
 * FileWriter 方法：
 * void flush()：刷新流（要在关闭流之前刷新）
 */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("c:\\1.txt");
		
		// 写一个字符
		fw.write(65);
		fw.flush();
		
		// 写一个字符数组
		char[] c = {'a', 'b', 'c', 'd'};
		fw.write(c);
		fw.flush();
		
		// 写字符数组的一部分
		fw.write(c, 2, 2);
		fw.flush();
		
		// 写入一个字符串
		fw.write("hello");
		fw.flush();
		
		fw.close();
	}

}
