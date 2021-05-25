/*package PartternMatcher;

import java.util.regex.*;
public class RegexExample1 {
	   public static void main(String args[]){
		      String content = "I am noob " +
		        "from runoob.com.";
		 
		      String pattern = ".*runoob.*";
		 
		      boolean isMatch = Pattern.matches(pattern, content);
		      System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
		   }
}

1.this is text

匹配字符串 "this is text"

2.this\s+is\s+text

注意字符串中的 \s+。

匹配单词 "this" 后面的 \s+ 可以匹配多个空格，之后匹配 is 字符串，再之后 \s+ 匹配多个空格然后再跟上 text 字符串。

可以匹配这个实例：this is text

3.^\d+(\.\d+)?

^ 定义了以什么开始

\d+ 匹配一个或多个数字

? 设置括号内的选项是可选的

\. 匹配 "."

可以匹配的实例："5", "1.5" 和 "2.21"。

Java 正则表达式和 Perl 的是最为相似的。

java.util.regex 包主要包括以下三个类：

Pattern 类：
pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

Matcher 类：
Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

PatternSyntaxException：
PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。*/