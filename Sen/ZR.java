package Sen;

public class ZR {
	public static void main(String[] args) {
		System.out.print("Hello World");
	}
}

//类
/*public class Puppy{
    public Puppy(){
    }
 
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
    }
}*/

//构造方法
/*public class Puppy{
    public Puppy(){
    }
 
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
    }
}*/

//创建对象
/*public class Puppy{
	   public Puppy(String name){
	      //这个构造器仅有一个参数：name
	      System.out.println("小狗的名字是 : " + name ); 
	   }
	   public static void main(String[] args){
	      // 下面的语句将创建一个Puppy对象
	      Puppy myPuppy = new Puppy( "tommy" );
	   }
	}
小狗的名字是 : tommy
*/

//访问实例变量和方法
/* 实例化对象 
Object referenceVariable = new Constructor();
 访问类中的变量 
referenceVariable.variableName;
 访问类中的方法 
referenceVariable.methodName();*/

//实例
/*public class Puppy{
	   int puppyAge;
	   public Puppy(String name){
	      // 这个构造器仅有一个参数：name
	      System.out.println("小狗的名字是 : " + name ); 
	   }
	 
	   public void setAge( int age ){
	       puppyAge = age;
	   }
	 
	   public int getAge( ){
	       System.out.println("小狗的年龄为 : " + puppyAge ); 
	       return puppyAge;
	   }
	 
	   public static void main(String[] args){
	       创建对象 
	      Puppy myPuppy = new Puppy( "tommy" );
	       通过方法来设定age 
	      myPuppy.setAge( 2 );
	       调用另一个方法获取age 
	      myPuppy.getAge( );
	      你也可以像下面这样访问成员变量 
	      System.out.println("变量值 : " + myPuppy.puppyAge ); 
	   }
	}
小狗的名字是 : tommy
小狗的年龄为 : 2
变量值 : 2*/

//import语句
