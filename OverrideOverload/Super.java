package OverrideOverload;
//当需要在子类中调用父类的被重写方法时，要使用 super 关键字。
class Super {
	   public void move(){
		      System.out.println("动物可以移动");
		   }
		}
		 
		class Dog extends Animal{
		   public void move(){
		      super.move(); // 应用super类的方法
		      System.out.println("狗可以跑和走");
		   }
		}
		 
		public class TestDog{
		   public static void main(String args[]){
		 
		      Animal b = new Dog(); // Dog 对象
		      b.move(); //执行 Dog类的方法
		 
		   }
}

//运行结果：
//	动物可以移动
//	狗可以跑和走