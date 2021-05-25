package switchcase;
//如果当前匹配成功的 case 语句块没有 break 语句，则从当前 case 开始，后续所有 case 的值都会输出，
//如果后续的 case 语句块有 break 语句则会跳出判断。
public class switchcase04 {
	   public static void main(String args[]){
		      int i = 1;
		      switch(i){
		         case 0:
		            System.out.println("0");
		         case 1:
		            System.out.println("1");
		         case 2:
		            System.out.println("2");
		         case 3:
		            System.out.println("3"); break;
		         default:
		            System.out.println("default");
		      }
		   }
}
