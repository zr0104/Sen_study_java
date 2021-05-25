package function;
//String[] 表明参数是字符串数组。下面的例子声明了一个名为 printGrade 的方法，并且调用它来打印给定的分数。
//这里printGrade方法是一个void类型方法，它不返回值。
//一个void方法的调用一定是一个语句。 所以，它被在main方法第三行以语句形式调用。就像任何以分号结束的语句一样。
public class void01 {
	  public static void main(String[] args) {
		    printGrade(78.5);
		  }
		 
		  public static void printGrade(double score) {
		    if (score >= 90.0) {
		       System.out.println('A');
		    }
		    else if (score >= 80.0) {
		       System.out.println('B');
		    }
		    else if (score >= 70.0) {
		       System.out.println('C');
		    }
		    else if (score >= 60.0) {
		       System.out.println('D');
		    }
		    else {
		       System.out.println('F');
		    }
		  }
}
