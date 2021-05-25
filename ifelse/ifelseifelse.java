package ifelse;
/*if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况。
使用 if，else if，else 语句的时候，需要注意下面几点：
if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后。
if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。
一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行。*/
public class ifelseifelse {
	   public static void main(String args[]){
		      int x = 30;
		 
		      if( x == 10 ){
		         System.out.print("Value of X is 10");
		      }else if( x == 20 ){
		         System.out.print("Value of X is 20");
		      }else if( x == 30 ){
		         System.out.print("Value of X is 30");
		      }else{
		         System.out.print("这是 else 语句");
		      }
		   }
}
