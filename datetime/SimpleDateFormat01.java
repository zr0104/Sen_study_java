package datetime;

import  java.util.*;
import java.text.*;

public class SimpleDateFormat01 {
	   public static void main(String args[]) {
		   
		      Date dNow = new Date( );
		      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		 
		      System.out.println("当前时间为: " + ft.format(dNow));
		   }
}
/*
日期比较说明：
Java使用以下三种方法来比较两个日期：
使用 getTime() 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
使用方法 before()，after() 和 equals()。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new Date (99, 2, 18)) 返回true。
使用 compareTo() 方法，它是由 Comparable 接口定义的，Date 类实现了这个接口。*/