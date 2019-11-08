package com.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test//月初
	public void testGetDateByInitMonth() {
		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sd.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(ss.format(date));
		
	}
	
	/**
	 * 
	 * @Title: 拼接下面根据时间范围查询订单的SQL：
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		将上面
		{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，将上面
		{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。

	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testSQL(){
		
		//月初
		Date start = DateUtil.getDateByInitMonth(new Date());
		//月末
		Date end = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		//把sql语句里面所有的{1}{2}替换成月初和月末的日期
		String sql2 = sql.replace("{1}", sd.format(start)).replace("{2}", sd.format(end));
		
		System.out.println(sql2);
	}

}
