package com.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author:huyi
 * @date: 2019年11月7日 下午7:47:28
 */
public class DateUtil {

	//改变日期设为月初 就是一号的00:00:00
	public static Date getDateByInitMonth(Date src){
		//获取日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类
		c.setTime(src);
		
		//改变日期设为月初 就是一号的00:00:00
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	
	//改变日期设为月末 就是29号的23:59:59
	public static Date getDateByFullMonth(Date src){
		//
		//获取日历类
		Calendar c = Calendar.getInstance();
		
		//用传入的日期初始化日历类
		c.setTime(src);
		//让月份+1
		c.add(Calendar.MONTH, 1);
		//调用月初的工具类
		Date date = getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(date);
		//让日期减去1秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
}
