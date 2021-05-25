package dowhilefor;
/*//关于 for 循环有以下几点说明：

最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
执行一次循环后，更新循环控制变量。
再次检测布尔表达式。循环执行上面的过程。*/
public class for01 {
	   public static void main(String args[]) {
		   
		      for(int x = 10; x < 20; x = x+1) {
		         System.out.print("value of x : " + x );
		         System.out.print("\n");
		      }
		   }
}
