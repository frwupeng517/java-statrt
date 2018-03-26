package io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream：写入数据文件，学习父类方法，使用子类对象
 * 
 * 子类中的构造方法：
 * 作用：绑定输出的输出目的
 * 参数：
 * 		File：封装文件
 * 		String：字符串的文件名
 * 
 * 流对象使用步骤
 * 	1、创建流子类的对象，绑定数据目的
 * 	2、调用流对象的方法 write 写
 * 	3、close 释放资源
 * 
 * 流对象的构造方法，可以创建文件，如果文件存在，直接覆盖
 *
 */
public class Outputstream01 {

	public static void main(String[] args) throws IOException {
		// FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件
		FileOutputStream fos = new FileOutputStream("c:\\a.txt");
		
		// void write(int b)：将指定的字节写入此文件输出流
		fos.write(97);
		
		// void write(byte[] b)：将b.length个字节从指定的字节数组写入此文件输出流
		byte[] b = {65,66,67,68};
		fos.write(b);
		
		// void write(byte[] b, int off, int len)：将len字节从位于偏移量off的指定字节数组写入此文件输出流
		// off 开始的索引，len 写几个
		fos.write(b, 2, 2);
		
		// 写入数组的简便方式
		// 写字符串
		// getBytes()：使用平台的默认字符集将字符串编码为byte序列，并将结果存储到一个新的byte数组中
		fos.write("hello".getBytes());
		
		// 关闭资源
		fos.close();
		
		// 输出：aABCDCDhello

	}

}
