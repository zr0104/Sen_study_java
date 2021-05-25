package Sen;

public class abstract01 {
	//抽象类
	abstract class Caravan{
		   private double price;
		   private String model;
		   private String year;
		   public abstract void goFast(); //抽象方法
		   public abstract void changeColor();
		}
	
	//抽象方法
	public abstract class SuperClass{
	    abstract void m(); //抽象方法
	}
	 
	class SubClass extends SuperClass{
	     //实现抽象方法
	      void m(){
	          //.........
	      }
	}
}
