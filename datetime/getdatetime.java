package datetime;
//所有getdate方法
import java.util.Date;

public class getdatetime {
		   public static void main(String args[]) {
		       // 初始化 Date 对象
		       Date date = new Date();
		        
		       // 使用 toString() 函数显示日期时间
		       System.out.println(date.toString());
		       System.out.println(date.after(date));
		       System.out.println(date.before(date));
		       System.out.println(date.clone());
		       System.out.println(date.compareTo(date));
		       System.out.println(date.compareTo(date));
		       System.out.println(date.equals(date));
		       System.out.println(date.getTime());
		       System.out.println(date.hashCode());

		   }
}

/*
date方法和描述：
1	boolean after(Date date)
若当调用此方法的Date对象在指定日期之后返回true,否则返回false。
2	boolean before(Date date)
若当调用此方法的Date对象在指定日期之前返回true,否则返回false。
3	Object clone( )
返回此对象的副本。
4	int compareTo(Date date)
比较当调用此方法的Date对象和指定日期。两者相等时候返回0。调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数。
5	int compareTo(Object obj)
若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
6	boolean equals(Object date)
当调用此方法的Date对象和指定日期相等时候返回true,否则返回false。
7	long getTime( )
返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
8	int hashCode( )
 返回此对象的哈希码值。
9	void setTime(long time)
用自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期。
10	String toString( )
把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 其中： dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
*/
