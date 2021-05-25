package EArray;

//类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
//解析： 因为getData()方法的参数是List类型的，所以name，age，number都可以作为这个方法的实参，这就是通配符的作用
import java.util.*;

public class GrenericTest {
  public static void main(String[] args) {
	  List<String> name = new ArrayList<String>();
	  List<Integer> age = new ArrayList<Integer>();
	  List<Number> number = new ArrayList<Number>();
	
	  name.add("icon");
	  age.add(101);
	  number.add(123456);
	  
	  getDate(name);
	  getDate(age);
	  getDate(number);
  }
  public static void getDate(List<?> date) {
	  System.out.println("date :" + date.get(0));
  }
}
