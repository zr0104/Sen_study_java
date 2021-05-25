package datetime;

import java.util.Date;

public class tndate02 {
	   public static void main(String args[]) {
	       // 初始化 Date 对象
	       Date date = new Date();
	        
	       // 使用toString()显示日期和时间
	       System.out.printf("%1$s %2$tB %2$td, %2$tY", 
	                         "Due date:", date);
	       System.out.println("");
	       // 显示格式化时间:或者，你可以使用 < 标志。它表明先前被格式化的参数要被再次使用
	       System.out.printf("%s %tB %<te, %<tY", 
	                         "Due date:", date);
	   }
}
