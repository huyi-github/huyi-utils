package com.utils;

import java.io.File;
/**
 * 
 * @ClassName: FileUtil 
 * @Description: 文件工具类
 * @author:huyi
 * @date: 2019年11月8日 上午9:21:02
 */
public class FileUtil {

	//给定一个方法名，返回改文件的扩展名
	public static String getExtendName(String fileName){
		//如果判断条件满足就执行第一个return，不满足执行第二个return
		if(null!=fileName && fileName.length()>-0)
		return fileName.substring(fileName.lastIndexOf("."));
		return null;
	}
	//返回系统临时目录
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	//返回操作系统用户目录
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
