package String;
//String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了
public class StringDemo {
	   public static void main(String args[]){
		      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
		      String helloString = new String(helloArray); 
		      System.out.println( helloString );
		   }
}
