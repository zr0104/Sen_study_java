package datetime;
//printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
import java.util.Date;

public class tndate {
	  public static void main(String args[]) {
		     // 初始化 Date 对象
		     Date date = new Date();
		 
		     //c的使用  
		    System.out.printf("全部日期和时间信息：%tc%n",date);          
		    //f的使用  
		    System.out.printf("年-月-日格式：%tF%n",date);  
		    //d的使用  
		    System.out.printf("月/日/年格式：%tD%n",date);  
		    //r的使用  
		    System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
		    //t的使用  
		    System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
		    //R的使用  
		    System.out.printf("HH:MM格式（24时制）：%tR",date);  
          /*		    
		    格式化字符串指出要被格式化的参数的索引。
		    索引必须紧跟在%后面，而且必须以$结束*/
	       // 使用toString()显示日期和时间
	       System.out.printf("%1$s %2$tB %2$td, %2$tY", 
	                         "Due date:", date);
	   }
}
