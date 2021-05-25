package dowhilefor;
//continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。
//在 for 循环中，continue 语句使程序立即跳转到更新语句。
//在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。
public class continue01 {
	   public static void main(String args[]) {
		      int [] numbers = {10, 20, 30, 40, 50};
		 
		      for(int x : numbers ) {
		         if( x == 30 ) {
		        continue;
		         }
		         System.out.print( x );
		         System.out.print("\n");
		      }
		   }
}
