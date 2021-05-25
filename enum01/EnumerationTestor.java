package enum01;
//数据结构Enumeration枚举
/*
1	boolean hasMoreElements( )
测试此枚举是否包含更多的元素。
2	Object nextElement( )
如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。
*/
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTestor {
	public static void main(String [] args) {
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesay");
		dayNames.add("wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
	}
}
