package enum01;
/*
序号	方法描述
1	String getProperty(String key)
 用指定的键在此属性列表中搜索属性。
2	String getProperty(String key, String defaultProperty)
用指定的键在属性列表中搜索属性。
3	void list(PrintStream streamOut)
 将属性列表输出到指定的输出流。
4	void list(PrintWriter streamOut)
将属性列表输出到指定的输出流。
5	void load(InputStream streamIn) throws IOException
 从输入流中读取属性列表（键和元素对）。
6	Enumeration propertyNames( )
按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
7	Object setProperty(String key, String value)
 调用 Hashtable 的方法 put。
8	void store(OutputStream streamOut, String description)
 以适合使用  load(InputStream)方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
*/
import java.util.*;

public class Properties01 {
	   public static void main(String args[]) {
		      Properties capitals = new Properties();
		      Set states;
		      String str;
		      
		      capitals.put("Illinois", "Springfield");
		      capitals.put("Missouri", "Jefferson City");
		      capitals.put("Washington", "Olympia");
		      capitals.put("California", "Sacramento");
		      capitals.put("Indiana", "Indianapolis");
		 
		      // Show all states and capitals in hashtable.
		      states = capitals.keySet(); // get set-view of keys
		      Iterator itr = states.iterator();
		      while(itr.hasNext()) {
		         str = (String) itr.next();
		         System.out.println("The capital of " +
		            str + " is " + capitals.getProperty(str) + ".");
		      }
		      System.out.println();
		 
		      // look for state not in list -- specify default
		      str = capitals.getProperty("Florida", "Not Found");
		      System.out.println("The capital of Florida is "
		          + str + ".");
		   }
}
