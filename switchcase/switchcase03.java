package switchcase;
//如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出。
public class switchcase03 {
	   public static void main(String args[]){
		      int i = 1;
		      switch(i){
		         case 0:
		            System.out.println("0");
		         case 1:
		            System.out.println("1");
		         case 2:
		            System.out.println("2");
		         default:
		            System.out.println("default");
		      }
		   }
}
