package extends01;

public class extends01 {
public class Animal{
	private String name;
	private int id;
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat(){
		System.out.println(name+"正在吃");
	}
	public void sleep(){
		System.out.print(name+"正在睡");
	}
	public void introduction() {
		System.out.print("大家好！我是" + id + "号" + name + ".");
	}
}
public class Penguin extends Animal{
	public Penguin(String myName, int myid) {
		super(myName,myid);
	}
public class Mouse extends Animal{
	public Mouse(String myName,int myid) {
		super(myName,myid);
	}
}
}
}
/*
企鹅：属性（姓名，id），方法（吃，睡，自我介绍）
老鼠：属性（姓名，id），方法（吃，睡，自我介绍）*/

/*//子类拥有父类非 private 的属性、方法。
子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
子类可以用自己的方式实现父类的方法。
Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。*/
