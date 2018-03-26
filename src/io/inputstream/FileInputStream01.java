package io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream 读取文件
 * 构造方法：为这个流对象绑定数据源
 * 参数：
 * 		File：类型对象
 * 		String：对象
 * 输入流读取文件的步骤：
 * 	1、创建字节输入流的子类对象
 * 	2、调用读取方法read读取
 * 	3、关闭资源
 * 
 * read()方法 执行一次，就会自动读取下一个字节
 * 返回值，返回的是读取到的字节，读取到结尾返回 -1
 *
 */
public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		// FileInputStream(File file)：通过打开与实际文件的连接创建一个 FileInputStream，该文件由文件系统中的File对象 file命名
		FileInputStream fis = new FileInputStream("c:\\a.txt");
		
		// int read()：从该输入流读取一个字节的数据
		// int read(byte[] b)：从该输入流读取最多 b.length 个字节的数据为字节数组
		// int read(byte[], int off, int len)：从该输入流读取最多 len 字节的数据为字节数组
		
		/*
		int read = fis.read();
		System.out.println(read); // 97
		
		read = fis.read();
		System.out.println(read); // 65
		*/
		
		// 读取一个字节，调用read()方法返回int
		// 使用循环方式，读取文件，循环结束的条件 read()方法返回 -1
		int len = 0; // 接受read()方法的返回值
		while( (len = fis.read()) != -1 ) {
			System.out.println(len + "-->" + (char)len);
		}
		
		fis.close();
		
		/*
		97-->a
		65-->A
		66-->B
		67-->C
		68-->D
		67-->C
		68-->D
		104-->h
		101-->e
		108-->l
		108-->l
		111-->o
		*/
	}

}
