package enum01;
/*// Vector向量方法
第一种构造方法创建一个默认的向量，默认大小为 10：
Vector()
第二种构造方法创建指定大小的向量。
Vector(int size)
第三种构造方法创建指定大小的向量，并且增量用 incr 指定。增量表示向量每次增加的元素数目。
Vector(int size,int incr)
第四种构造方法创建一个包含集合 c 元素的向量：
Vector(Collection c)*/

import java.util.*;

public class Vector01 {
  public static void main(String[] args) {
	  // initial size is 3, increment is 2
	  Vector v = new Vector(3,2);
	  System.out.println("Initial size：" + v.size());
	  System.out.println("Initial size：" + 
	  v.capacity());//v.capacity()返回此向量的当前容量。
	  v.addElement(new Integer(1));
	  v.addElement(new Integer(2));
	  v.addElement(new Integer(3));
	  v.addElement(new Integer(4));
	  System.out.println("Capacity after four additions：" +
	      v.capacity());
	  v.addElement(new Double(5.45));
	  System.out.println("Current capacity：" +
	  v.capacity());
	  v.addElement(new Double(6.08));
	  v.addElement(new Double(7));
	  System.out.println("Current capacity: " +
	  v.capacity());
	  v.addElement(new Float(9.4));
	  v.addElement(new Integer(10));
	  System.out.println("Current capacity：" +
	  v.capacity());
	  v.addElement(new Integer(11));
	  v.addElement(new Integer(12));
	  System.out.println("First element：" +
	    (Integer)v.firstElement());
	  System.out.println("First element：" +
			    (Integer)v.lastElement());
	  if(v.contains(new Integer(3)))//v.contains()指向向量元素
		  System.out.println("Vector contains 3.");
	  //enumerate the elements in the vector.
	  Enumeration vEnum = v.elements();
	  System.out.println("\nElements in vector:");
	  while(vEnum.hasMoreElements())
		  System.out.println(vEnum.nextElement()+ " ");
	  System.out.println();
  }
}
