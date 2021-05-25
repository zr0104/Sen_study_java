package function;
/*protected void finalize()
{
   // 在这里终结代码
}*/
//关键字 protected 是一个限定符，它确保 finalize() 方法不会被该类以外的代码调用。
//当然，Java 的内存回收可以由 JVM 来自动完成。如果你手动使用，则可以使用上面的方法。
public class finalze01 {
	public static void main(String[] agrs) {
		Cake c1 = new Cake(1);
		Cake c2 = new Cake(2);
		Cake c3 = new Cake(3);
		
		c2 = c3 =null;
		System.gc();//调用Java垃圾收集器
	}
}
	class Cake extends Object {
		private int id;
		public Cake(int id) {
			this.id = id;
			System.out.println("Cake Object " + id + "is created");
		}
		protected void finalize() throws java.lang.Throwable{
			super.finalize();
			System.out.println("Cake Object" + id + "is disposed");
		}
	}
