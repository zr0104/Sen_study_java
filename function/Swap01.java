package function;
//下面的例子演示按值传递的效果。
//创建一个方法，该方法用于交换两个变量。
//传递两个参数调用swap方法。有趣的是，方法被调用后，实参的值并没有改变。
public class Swap01 {
	public static void main(String[] args) {
	    int num1 = 1;
	    int num2 = 2;
	 
	    System.out.println("交换前 num1 的值为：" +
	                        num1 + " ，num2 的值为：" + num2);
	 
	    // 调用swap方法
	    swap(num1, num2);
	    System.out.println("交换后 num1 的值为：" +
	                       num1 + " ，num2 的值为：" + num2);
	  }
	  /** 交换两个变量的方法 */
	  public static void swap(int n1, int n2) {
	    System.out.println("\t进入 swap 方法");
	    System.out.println("\t\t交换前 n1 的值为：" + n1
	                         + "，n2 的值：" + n2);
	    // 交换 n1 与 n2的值
	    int temp = n1;
	    n1 = n2;
	    n2 = temp;
	 
	    System.out.println("\t\t交换后 n1 的值为 " + n1
	                         + "，n2 的值：" + n2);
	  }
}
