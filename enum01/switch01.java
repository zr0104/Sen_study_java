package enum01;
//枚举类常应用于 switch 语句中
public class switch01 {
	enum Color
	{
	    RED, GREEN, BLUE;
	}
	public static class MyClass {
	  public static void main(String[] args) {
	    Color myVar = Color.BLUE;

	    switch(myVar) {
	      case RED:
	        System.out.println("红色");
	        break;
	      case GREEN:
	         System.out.println("绿色");
	        break;
	      case BLUE:
	        System.out.println("蓝色");
	        break;
	    }
	  }
	}
}
