package enum01;
//声明枚举类型
public class enum01 {
	enum Color
	{
	    RED, GREEN, BLUE;
	}
	 
	public static class Test
	{
	    // 执行输出结果
	    public static void main(String[] args)
	    {
	        Color c1 = Color.RED;
	        System.out.println(c1);
	    }
	}
}
