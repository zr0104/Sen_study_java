package enum01;

	class Dog{
	    String name;//成员变量
	    int age;
	    String color;
	    public void set(String name,int age,String color){
	        this.name=name;//this.name,这个name为成员变量
	        this.age=age;
	        this.color=color;
	    }
	    public String toString(){
	        return "我的姓名："+this.name+"我的年龄："+this.age+"我的颜色："+this.color;
	    }
	    public Dog value(){
	        return this;//可以看做一个变量，他的值是当前对象的引用
	    }
	}
	public class Test1{
	    public static void main(String[] args){
	        Dog one=new Dog();
	        Dog two=new Dog();
	        Dog three=new Dog();
	        one.set("第一只狗",5,"黑色");
	        two.set("第二只狗",6,"白色");
	        System.out.println(one);
	        System.out.println(two);
	        three=two.value();
	        System.out.println(three);

	    }
	}
