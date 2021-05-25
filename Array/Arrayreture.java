package Array;
//以下实例中 result 数组作为函数的返回值。
public class Arrayreture {
	public static int[] reverse(int[] list) {
		  int[] result = new int[list.length];
		 
		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		  }
		  return result;
		}
}
