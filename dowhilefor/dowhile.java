package dowhilefor;
//对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
public class dowhile {
	   public static void main(String args[]){
		      int x = 10;
		 
		      do{
		         System.out.print("value of x : " + x );
		         x++;
		         System.out.print("\n");
		      }while( x < 20 );
		   }
}
