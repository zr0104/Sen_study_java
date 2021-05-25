package function;
//打印所有的命令行参数：
public class CommandLine {
	   public static void main(String args[]){ 
		      for(int i=0; i<args.length; i++){
		         System.out.println("args[" + i + "]: " + args[i]);
		      }
		   }
}

/*
结果应该显示：
$ javac CommandLine.java 
$ java CommandLine this is a command line 200 -100
args[0]: this
args[1]: is
args[2]: a
args[3]: command
args[4]: line
args[5]: 200
args[6]: -100
*/