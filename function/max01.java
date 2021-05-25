package function;

public class max01 {
	   /** 主方法 */
	   public static void main(String[] args) {
	      int i = 5;
	      int j = 2;
	      int k = max(i, j);
	      System.out.println( i + " 和 " + j + " 比较，最大值是：" + k);
	   }
	 
	   /** 返回两个整数变量较大的值 */
	   public static int max(int num1, int num2) {
	      int result;
	      if (num1 > num2)
	         result = num1;
	      else
	         result = num2;
	 
	      return result; 
	   }
}

/*
Java 支持两种调用方法的方式，根据方法是否返回值来选择。

当程序调用一个方法时，程序的控制权交给了被调用的方法。当被调用方法的返回语句执行或者到达方法体闭括号时候交还控制权给程序。

当方法返回一个值的时候，方法调用通常被当做一个值

*/