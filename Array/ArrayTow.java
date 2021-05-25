package Array;
/*String s[][] = new String[2][];
s[0] = new String[2];
s[1] = new String[3];
s[0][0] = new String("Good");
s[0][1] = new String("Luck");
s[1][0] = new String("to");
s[1][1] = new String("you");
s[1][2] = new String("!");*/
public class ArrayTow {
	public static void main(String[] agr) {
	int a[][] = new int[2][3];
	String s[][] = new String[2][];
	s[0] = new String[2];
	s[1] = new String[3];
	s[0][0] = new String("Good");
	s[0][1] = new String("Luck");
	s[1][0] = new String("to");
	s[1][1] = new String("you");
	s[1][2] = new String("!");
	System.out.println(int[2][]);
}
}
/*解析：
s[0]=new String[2] 和 s[1]=new String[3] 是为最高维分配引用空间，
也就是为最高维限制其能保存数据的最长的长度，
然后再为其每个数组元素单独分配空间 s0=new String("Good") 等操作。*/
