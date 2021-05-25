package EArray;

/*
 2、类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
解析： 在(//1)处会出现错误，因为getUperNumber()方法中的参数已经限定了参数泛型上限为Number，所以泛型为String是不在这个范围之内，所以会报错
3、类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如 Object 类型的实例。*/

import java.util.*;
public class GenericTest02 {
    
   public static void main(String[] args) {
       List<String> name = new ArrayList<String>();
       List<Integer> age = new ArrayList<Integer>();
       List<Number> number = new ArrayList<Number>();
       
       name.add("icon");
       age.add(18);
       number.add(314);

       //getUperNumber(name);//1
       getUperNumber(age);//2
       getUperNumber(number);//3
      
  }

  public static void getData(List<?> data) {
     System.out.println("data :" + data.get(0));
  }
  
  public static void getUperNumber(List<? extends Number> data) {
         System.out.println("data :" + data.get(0));
      }
}
