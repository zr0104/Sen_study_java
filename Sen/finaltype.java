package Sen;

public class finaltype {
	public static void main(String[] agr) {
	//final变量
	  final int value = 10;
	  // 下面是声明常量的实例
	  public static final int BOXWIDTH = 6;
	  static final String TITLE = "Manager";
	 
	  public void changeValue(){
	     value = 12; //将输出一个错误
	  }
	  
	  //final方法
	    public final void changeName(){
	        // 方法体
	     }
	  //final类
	    public final class Test {
	    	   // 类体
	    	}
	}
}
