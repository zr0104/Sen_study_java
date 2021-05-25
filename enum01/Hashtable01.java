package enum01;
/*
Hashtable定义了四个构造方法。第一个是默认构造方法：
Hashtable()
第二个构造函数创建指定大小的哈希表：
Hashtable(int size)
第三个构造方法创建了一个指定大小的哈希表，并且通过fillRatio指定填充比例。
填充比例必须介于0.0和1.0之间，它决定了哈希表在重新调整大小之前的充满程度：
Hashtable(int size,float fillRatio)
第四个构造方法创建了一个以M中元素为初始化元素的哈希表。
哈希表的容量被设置为M的两倍。
Hashtable(Map m)
*/
import java.util.*;

public class Hashtable01 {
	   public static void main(String args[]) {
		      // Create a hash map
		      Hashtable balance = new Hashtable();
		      Enumeration names;
		      String str;
		      double bal;

		      balance.put("Zara", new Double(3434.34));
		      balance.put("Mahnaz", new Double(123.22));
		      balance.put("Ayan", new Double(1378.00));
		      balance.put("Daisy", new Double(99.22));
		      balance.put("Qadir", new Double(-19.08));

		      // Show all balances in hash table.
		      names = balance.keys();
		      while(names.hasMoreElements()) {
		         str = (String) names.nextElement();
		         System.out.println(str + ": " +
		         balance.get(str));
		      }
		      System.out.println();
		      // Deposit 1,000 into Zara's account
		      bal = ((Double)balance.get("Zara")).doubleValue();
		      balance.put("Zara", new Double(bal+1000));
		      System.out.println("Zara's new balance: " +
		      balance.get("Zara"));
		   }
}
