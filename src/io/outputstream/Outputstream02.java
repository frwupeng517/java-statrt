package io.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的续写和换行问题
 * FileOutputStream(File file, boolean append)
 * 续写：第二个参数加入true，在文件中，写入换行，符号换行 \r\n
 * \r\n 可以在上一行的末尾，也可以在下一行的开头
 *
 */
public class Outputstream02 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\b.txt", true);
		fos.write("hello\r\n".getBytes());
		fos.write("world".getBytes());
		fos.close();
		
//		hello
//		world

	}

}
