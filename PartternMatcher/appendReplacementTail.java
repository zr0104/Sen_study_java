package PartternMatcher;
//Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换：
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class appendReplacementTail {
	   private static String REGEX = "a*b";
	   private static String INPUT = "aabfooaabfooabfoobkkk";
	   private static String REPLACE = "-";
	   public static void main(String[] args) {
	      Pattern p = Pattern.compile(REGEX);
	      // 获取 matcher 对象
	      Matcher m = p.matcher(INPUT);
	      StringBuffer sb = new StringBuffer();
	      while(m.find()){
	         m.appendReplacement(sb,REPLACE);
	      }
	      m.appendTail(sb);
	      System.out.println(sb.toString());
	   }
}

/*
PatternSyntaxException 类的方法
PatternSyntaxException 是一个非强制异常类，它指示一个正则表达式模式中的语法错误。

PatternSyntaxException 类提供了下面的方法来帮助我们查看发生了什么错误。
1	public String getDescription()
获取错误的描述。
2	public int getIndex()
 获取错误的索引。
3	public String getPattern()
获取错误的正则表达式模式。
4	public String getMessage()
返回多行字符串，包含语法错误及其索引的描述、错误的正则表达式模式和模式中错误索引的可视化指示。*/