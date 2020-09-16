package com.lmy.springboot.modules.java.fileopera;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文件流操作，参考blob：https://blog.csdn.net/jiangxinyu/article/details/7885518?utm_medium=distribute.pc_relevant.none-task-blog-OPENSEARCH-2.nonecase&depth_1-utm_source=distribute.pc_relevant.none-task-blog-OPENSEARCH-2.nonecase
 */
public class testFile {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file(内存)----输入流---->【程序】----输出流---->file(内存)
		File file = new File("D:\\develop\\springboot\\target\\classes", "addfile.txt");
		// try {
		// 	file.createNewFile(); // 创建文件
		// } catch (IOException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }
 
		// 向文件写入内容(输出流)
		String str = "亲爱的小南瓜！";
		byte bt[] = new byte[1024];
		bt = str.getBytes();
		try {
			FileOutputStream in = new FileOutputStream(file);
			try {
				in.write(bt, 0, bt.length);
				in.close();
				// boolean success=true;
				// System.out.println("写入文件成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			// 读取文件内容 (输入流)
			FileInputStream out = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(out);
			int ch = 0;
			while ((ch = isr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}