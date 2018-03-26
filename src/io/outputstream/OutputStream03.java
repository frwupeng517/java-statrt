package io.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流的异常处理 try catch finally
 * 
 * 细节：
 * 1、保证流对象变量，作用域足够
 * 2、catch 里面，怎么处理异常
 * 		输出异常的信息，目的看到哪里出现了问题
 * 		停下程序，重新尝试
 * 3、如果流对象建立失败了，需要关闭资源吗？
 * 		new 一个对象的时候，如果失败了，就没有占用系统资源
 * 		释放资源的时候，对流对象判断是否为 null
 * 		变量不是null的时候，对象如果建立成功，就需要关闭资源
 */

public class OutputStream03 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		// 在 try 外面声明一个对象，try里面创建一个对象
		try {
			fos = new FileOutputStream("g:\\bbbb.txt");
			fos.write(100);
		} catch(IOException e) {
			System.out.println(e);
			throw new RuntimeException("文件写入失败，重试");
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				throw new RuntimeException("关闭资源失败");
			}
		}

	}

}
