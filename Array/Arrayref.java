package Array;
//数组处理：数组的元素类型和数组的大小都是确定的，所以当处理数组元素时候，我们通常使用基本循环或者 For-Each 循环。
public class Arrayref {
	   public static void main(String[] args) {
		      double[] myList = {1.9, 2.9, 3.4, 3.5};
		 
		      // 打印所有数组元素
		      for (int i = 0; i < myList.length; i++) {
		         System.out.println(myList[i] + " ");
		      }
		      // 计算所有元素的总和
		      double total = 0;
		      for (int i = 0; i < myList.length; i++) {
		         total += myList[i];
		      }
		      System.out.println("Total is " + total);
		      // 查找最大元素
		      double max = myList[0];
		      for (int i = 1; i < myList.length; i++) {
		         if (myList[i] > max) max = myList[i];
		      }
		      System.out.println("Max is " + max);
		   }
}
